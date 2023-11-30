package com.tsr.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.tsr.entities.Product;

public interface ProductsRepository extends CrudRepository<Product, Integer>{

}
