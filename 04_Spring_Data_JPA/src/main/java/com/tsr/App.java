package com.tsr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tsr.bo.ProductBo;
import com.tsr.config.RootConfig;
import com.tsr.service.ProductService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
    	ProductService service = context.getBean(ProductService.class);
    	//ProductBo product = service.getProductById(15);
    	//System.out.println(product);
    	
//    	List<ProductBo> productBos = service.getProductsBy("price");
//    	productBos.forEach(System.out::println);
    	
//    	List<ProductBo> productBos = service.getProductByPagination(0, 5);
//    	productBos.forEach(System.out::println);
    	
    	//List<ProductBo> productBos = service.findProductByName("Ipad-12.9");
    	//productBos.forEach(System.out::println);
    	
    	List<ProductBo> productBos = service.findProductsBetweenRange(1000, 25000);
    	productBos.forEach(System.out::println);
    	
    }
}
