package com.tsr.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsr.bo.ProductBO;
import com.tsr.dao.ProductDAO;
import com.tsr.entities.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public ProductBO getProductById(int productId) {
		Product product = productDAO.getProductById(productId);
		ProductBO productBO = new ProductBO();
		BeanUtils.copyProperties(product, productBO);
		return productBO;
	}
}
