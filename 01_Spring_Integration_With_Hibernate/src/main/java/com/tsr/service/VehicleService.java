package com.tsr.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsr.bo.VehicleBO;
import com.tsr.dao.VehicleDAO;
import com.tsr.entities.Vehicle;

@Service
public class VehicleService {

	@Autowired
	private VehicleDAO vehicleDAO;
	
	@Transactional(readOnly = true)
	public VehicleBO getVehicle(int vehicleNo) {
		
		Vehicle vehicle = vehicleDAO.getVehicle(vehicleNo);
		VehicleBO vehicleBO = new VehicleBO();
		BeanUtils.copyProperties(vehicle, vehicleBO);
		return vehicleBO ;
	}
}
