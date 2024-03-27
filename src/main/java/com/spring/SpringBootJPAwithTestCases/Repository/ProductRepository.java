package com.spring.SpringBootJPAwithTestCases.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.SpringBootJPAwithTestCases.Entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
