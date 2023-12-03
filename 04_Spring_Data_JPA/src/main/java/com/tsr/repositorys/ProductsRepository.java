package com.tsr.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsr.entities.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
	public List<Product> findByName(String name);

	public List<Product> findByPriceBetween(double price1,double price2);
}
