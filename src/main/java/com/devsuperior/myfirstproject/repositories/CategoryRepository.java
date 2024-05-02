package com.devsuperior.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.devsuperior.myfirstproject.entities.Category;

@Component
public class CategoryRepository {
	
	//chave/valor , guardando na memória
	private Map<Long, Category> map = new HashMap<> ();
	
	//inserir
	public void save(Category obj) {
		map.put(obj.getId(), obj);
	}
	// retorna a categoria que corresponde ao ID informado
	public Category findById(Long id) {
		return map.get(id);
	}
	
	//retorna uma lista com todas as categorias do banco
	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}

}
