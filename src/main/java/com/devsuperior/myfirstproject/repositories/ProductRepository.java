package com.devsuperior.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.devsuperior.myfirstproject.entities.Product;

@Component
public class ProductRepository {
	
	//chave/valor , guardando na memória
	private Map<Long, Product> map = new HashMap<> ();
	
	//inserir
	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}
	// retorna a categoria que corresponde ao ID informado
	public Product findById(Long id) {
		return map.get(id);
	}
	
	//retorna uma lista com todas as categorias do banco
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}

}
