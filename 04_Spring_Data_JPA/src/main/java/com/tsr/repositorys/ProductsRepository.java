package com.tsr.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tsr.entities.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
	public List<Product> findByName(String name);

	public List<Product> findByPriceBetween(double price1,double price2);
	
	@Query(value="from Product p where p.id = ?1")
	public Product findByid(int id);
	
	@Query(value="from Product p where p.name like :pname")
	public List<Product> findByNameLike(@Param("pname") String name);
	
	@Modifying
	@Query(value="update Product p set p.name = :name where p.id = :id")
	public int updateProductNameById(@Param("name") String name, @Param("id") int id);
	
	//Dynamic Projections
	<T> List<T> findByNameLike(String name,Class<T> type);
}
