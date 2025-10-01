package com.example.restful.config;

import com.example.restful.dao.JdbcProductDao;
import com.example.restful.dao.ProductDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DaoConfig {

  @Bean
  ProductDao productDao(JdbcTemplate jdbcTemplate){
    return new JdbcProductDao(jdbcTemplate);
  }
}
