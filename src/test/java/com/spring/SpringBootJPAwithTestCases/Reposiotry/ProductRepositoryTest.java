package com.spring.SpringBootJPAwithTestCases.Reposiotry;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.SpringBootJPAwithTestCases.Entity.Product;
import com.spring.SpringBootJPAwithTestCases.Repository.ProductRepository;
import com.spring.SpringBootJPAwithTestCases.Service.ProductService;


@SpringBootTest
public class ProductRepositoryTest {

	@Autowired
	private ProductService productservice;

	@Autowired
	private ProductRepository productrepo;
	
	
	@Test
	void save() {
		//create product
		Product product=new Product();
		product.setProductName("Name1");
		product.setProductDescription("Description 1");
		product.setPrice(1000);
		
		//save Product
		Product savedObject=productservice.addProduct(product);
		
	}
	
	@Test
	void updateUsingSavemethod() {
		//find and retrieve data by using Id
		 int id=554;
		 Product product=productservice.getProductbyID(id);
;
		 System.out.println(product.toString());
		 product.setProductName("Product Update Name 1");
		 product.setProductDescription("Producct Updated Description");
		 productservice.addProduct(product);
		
	}
	
	@Test
	void FindByIdMethod() {
		
		int id=554;
		productservice.getProductbyID(id);
		
	}
	
	@Test
	void SaveAllProduct() {
		Product p1=new Product();
		p1.setProductName("p99");
		p1.setProductDescription("p1");
		p1.setPrice(100000);
		
		Product p2=new Product();
		p1.setProductName("p980");
		p1.setProductDescription("p2");
		p1.setPrice(10);
		
		
		productrepo.saveAll(List.of(p1,p2));
		}
	
	@Test
	void findallProduct() {
		List<Product> product=productservice.getAll();
		System.out.println(product.toString());
	}
	
	@Test
	void deleteByIdmethod() {
		int id=554;
		productrepo.deleteById(id);
	}
	
	@Test
	void delete() {
		int id=554;
		Product product = productservice.getProductbyID(id);
		productrepo.delete(product);
	}
	
	@Test
	void deleteAll() {
		productrepo.deleteAll();
	}
	
	@Test
	void CountProducts() {
		long count=productrepo.count();
		System.out.println(count);
	}
	
	@Test
	void CheckProductExistsOrNot() {
		int id=1;
		boolean result=productrepo.existsById(id);
		System.out.println(result);
	}
}
