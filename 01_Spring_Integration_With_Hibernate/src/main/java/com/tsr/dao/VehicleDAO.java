package com.tsr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.tsr.entities.Vehicle;

@Repository
public class VehicleDAO {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Vehicle getVehicle(int vehicleNo) {
		return hibernateTemplate.get(Vehicle.class, vehicleNo);
	}
}
