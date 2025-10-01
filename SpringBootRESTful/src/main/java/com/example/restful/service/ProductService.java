package com.example.restful.service;

import com.example.restful.dao.ProductDao;
import com.example.restful.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  private final ProductDao dao;
  public ProductService(ProductDao dao) {
    this.dao = dao;

  }

  public List<Product> getAll() {
    return dao.findAll();
  }

  public Product getById(int id) {
    return dao.findById(id).orElseThrow(()->new RuntimeException("Not found"+id));
  }

  public Product create(Product p){
    return dao.insert(p);
  }

  public Product update(int id, Product p){
    var existing= getById(id);
    existing.setPname(p.getPname());
    existing.setBatchno(p.getBatchno());
    existing.setPrice(p.getPrice());
    existing.setNoofproduct(p.getNoofproduct());
    dao.update(existing);
    return existing;
  }

  public void delete(int id) {
    if(dao.deleteById(id)==0) throw new RuntimeException("Not found"+id);
  }

}
