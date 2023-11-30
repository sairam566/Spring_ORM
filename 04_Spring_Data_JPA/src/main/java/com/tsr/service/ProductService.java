package com.tsr.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsr.bo.ProductBo;
import com.tsr.entities.Product;
import com.tsr.repositorys.ProductsRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Transactional(readOnly = true)
	public ProductBo getProductById(int id) {
		Product product = productsRepository.findById(id).get();
		ProductBo productBo = new ProductBo();
		BeanUtils.copyProperties(product, productBo);
		return productBo;
	}
}
