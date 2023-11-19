package com.tsr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.stereotype.Repository;

import com.tsr.entities.Product;

@Repository
public class ProductDAO {
	
	@Autowired
	private JpaTemplate jpaTemplate;
	
	public Product getProductById(int productId) {
		return jpaTemplate.find(Product.class, productId);
	}
}
