package com.tsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tsr.bo.ProductBO;
import com.tsr.config.RootConfig;
import com.tsr.service.ProductService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
    	ProductService productService = context.getBean(ProductService.class);
    	ProductBO productBO = productService.getProductById(15);
    	System.out.println(productBO);
    }
}
