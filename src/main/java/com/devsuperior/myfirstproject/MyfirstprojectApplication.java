package com.devsuperior.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myfirstproject.entities.Category;
import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.CategoryRepository;
import com.devsuperior.myfirstproject.repositories.ProductRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner{

	//injecao de dependencias
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override  //salvar dentro do map, com a injecao de dependencias
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Eletronics");
		
		Product p1 = new Product(1L, "TV","2200.00", cat1);
		Product p2 = new Product(2L, "Domain Driven Design","120.00", cat2);
		Product p3 = new Product(3L, "PS5","2800.00", cat1);
		Product p4 = new Product(4L, "Docker","100.00", cat2);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat1.getProducts().addAll(Arrays.asList(p2, p4));
		
		categoryRepository.save(cat2);
		categoryRepository.save(cat1);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
	}
	
	

}
