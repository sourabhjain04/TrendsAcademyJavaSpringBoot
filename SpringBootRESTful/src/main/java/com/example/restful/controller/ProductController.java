package com.example.restful.controller;

import com.example.restful.model.Product;
import com.example.restful.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> all() {
     return service.getAll();
    }
    @GetMapping("/{id}")
    public Product one(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@Valid @RequestBody Product p) {
        return service.create(p);
    }
    @PutMapping("/{id}")
    public Product update(@PathVariable int id, @Valid @RequestBody Product p) {
        return service.update(id, p);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        service.delete(id);
    }







}
