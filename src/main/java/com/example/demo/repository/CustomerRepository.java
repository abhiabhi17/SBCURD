package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Product;
 

public interface CustomerRepository extends CrudRepository<Product, Long> {
     
    @Query(value = "SELECT p FROM Product p WHERE p.name LIKE '%' || :keyword || '%'"
    		
            + " OR p.brand LIKE '%' || :keyword || '%'"
            + " OR p.price LIKE '%' || :keyword || '%'"
            + " OR p.madein LIKE '%' || :keyword || '%'")
    public List<Product> search(@Param("keyword") String keyword);
}