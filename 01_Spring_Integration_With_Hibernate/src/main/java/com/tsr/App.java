package com.tsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tsr.bo.VehicleBO;
import com.tsr.config.RootConfig;
import com.tsr.service.VehicleService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
    	VehicleService service = context.getBean("vehicleService",VehicleService.class);
    	VehicleBO vehicle = service.getVehicle(1);
    	System.out.println(vehicle);
    }
}
