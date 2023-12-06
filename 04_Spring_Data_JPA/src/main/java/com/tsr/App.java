package com.tsr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tsr.bo.ProductBo;
import com.tsr.config.RootConfig;
import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.Parcel;
import com.tsr.service.DeliveryAssociateService;
import com.tsr.service.ParcelService;
import com.tsr.service.ProductService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		ProductService service = context.getBean(ProductService.class);
		DeliveryAssociateService deliveryService = context.getBean(DeliveryAssociateService.class);
		ParcelService parcelService = context.getBean(ParcelService.class);
		
		 //ProductBo product = service.getProductById(16);
		 //System.out.println(product);

//    	List<ProductBo> productBos = service.getProductsBy("price");
//    	productBos.forEach(System.out::println);

//    	List<ProductBo> productBos = service.getProductByPagination(0, 5);
//    	productBos.forEach(System.out::println);

		// List<ProductBo> productBos = service.findProductByName("Ipad-12.9");
		// productBos.forEach(System.out::println);

//    	List<ProductBo> productBos = service.findProductsBetweenRange(1000, 25000);
//    	productBos.forEach(System.out::println);

		// System.out.println( service.findById(15));

//		List<ProductBo> productBos = service.findByNameLike("%I%");
//		productBos.forEach(System.out::println);

//		int value = service.updateProductNameById("Iphone-15",16);
//		System.out.println(value);
		
//		List<DeliveryAssociate> deliveryByWeight = deliveryService.getDeliveryAssociateByAge(5);
//		deliveryByWeight.forEach(System.out::println);
		
		List<Parcel> parcelByDeliveryAssociate = parcelService.getAllParcelDeliveredByAssociate("BHA");
		parcelByDeliveryAssociate.forEach(System.out::println);
	}
}
