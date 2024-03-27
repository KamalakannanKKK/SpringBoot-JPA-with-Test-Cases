package com.spring.SpringBootJPAwithTestCases.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringBootJPAwithTestCases.Entity.Product;
import com.spring.SpringBootJPAwithTestCases.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productrepository;

	public List<Product> getAll() {
		return productrepository.findAll();
	}

	public Product addProduct(Product product) {
		return productrepository.save(product);
	}

	public Product getProductbyID(int id) {
		return productrepository.findById(id).get();
	}

	public void deletebyId(int id) {
		productrepository.deleteById(id);
	}
	
	
}
