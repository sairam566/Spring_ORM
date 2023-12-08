package com.tsr.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

	@Transactional(readOnly = true)
	public List<ProductBo> getProductsBy(String columnName) {
		Iterable<Product> findAll = productsRepository.findAll(Sort.by(columnName).ascending());
		List<ProductBo> productBos = new ArrayList<>();
		findAll.iterator().forEachRemaining(val -> {
			ProductBo bo = new ProductBo();
			BeanUtils.copyProperties(val, bo);
			productBos.add(bo);
		});
		return productBos;
	}

	@Transactional(readOnly = true)
	public List<ProductBo> getProductByPagination(int pageNo, int pageSize) {
		Page<Product> findAll = productsRepository
				.findAll(PageRequest.of(pageNo, pageSize, Sort.by("id").descending()));
		List<ProductBo> productBos = new ArrayList<>();
		findAll.iterator().forEachRemaining(val -> {
			ProductBo bo = new ProductBo();
			BeanUtils.copyProperties(val, bo);
			productBos.add(bo);
		});
		return productBos;
	}

	@Transactional(readOnly = true)
	public List<ProductBo> findProductByName(String name) {
		List<Product> products = productsRepository.findByName(name);
		List<ProductBo> productBos = null;
		productBos = products.stream().map(val -> {
			ProductBo bo = new ProductBo();
			BeanUtils.copyProperties(val, bo);
			return bo;
		}).collect(Collectors.toList());

		return productBos;
	}

	@Transactional(readOnly = true)
	public List<ProductBo> findProductsBetweenRange(double price1, double price2) {
		List<Product> listOfProducts = productsRepository.findByPriceBetween(price1, price2);
		List<ProductBo> productBos = null;
		productBos = listOfProducts.stream().map(product -> {
			ProductBo bo = new ProductBo();
			BeanUtils.copyProperties(product, bo);
			return bo;
		}).collect(Collectors.toList());
		return productBos;
	}

	@Transactional(readOnly = true)
	public ProductBo findById(int id) {
		Product product = productsRepository.findByid(id);
		ProductBo bo = new ProductBo();
		BeanUtils.copyProperties(product, bo);
		return bo;
	}

	@Transactional(readOnly = true)
	public List<ProductBo> findByNameLike(String name) {
		List<Product> products = productsRepository.findByNameLike(name);
		List<ProductBo> productBos = products.stream().map(product -> {
			ProductBo bo = new ProductBo();
			BeanUtils.copyProperties(product, bo);
			return bo;
		}).collect(Collectors.toList());
		return productBos;
	}

	@Transactional(readOnly = false)
	public int updateProductNameById(String name, int id) {
		return productsRepository.updateProductNameById(name, id);
	}
	
	@Transactional(readOnly = true)
	public <T> List<T> getProductLike(String name,Class<T> entity){
		return productsRepository.findByNameLike(name,entity);
	}
}
