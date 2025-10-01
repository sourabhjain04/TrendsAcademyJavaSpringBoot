package com.example.restful.dao;

import com.example.restful.model.Product;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

public class JdbcProductDao implements ProductDao {
    private final JdbcTemplate jdbc;

    public JdbcProductDao(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    private Product mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
        return new Product(
                rs.getInt("id"),
                rs.getString("pname"),
                rs.getString("batchno"),
                rs.getDouble("price"),
                rs.getInt("noofproduct")
        );
    }

    @Override
    public List<Product> findAll() {
        return jdbc.query("SELECT id, pname, batchno, price, noofproduct FROM products", this::mapRow);
    }

    @Override
    public Optional<Product> findById(int id) {
        try {
            Product p = jdbc.queryForObject(
                    "SELECT id, pname, batchno, price, noofproduct FROM products WHERE id = ?",
                    this::mapRow, id);
            return Optional.ofNullable(p);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public Product insert(Product p) {
        String sql = "INSERT INTO products (pname, batchno, price, noofproduct) VALUES (?,?,?,?)";
        KeyHolder kh = new GeneratedKeyHolder();

        jdbc.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getPname());
            ps.setString(2, p.getBatchno());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getNoofproduct());
            return ps;
        }, kh);

        Number key = kh.getKey();
        if (key != null) p.setId(key.intValue());
        return p;
    }

    @Override
    public int update(Product p) {
        String sql = "UPDATE products SET pname=?, batchno=?, price=?, noofproduct=? WHERE id=?";
        return jdbc.update(sql, p.getPname(), p.getBatchno(), p.getPrice(), p.getNoofproduct(), p.getId());
    }

    @Override
    public int deleteById(int id) {
        return jdbc.update("DELETE FROM products WHERE id = ?", id);
    }
}
