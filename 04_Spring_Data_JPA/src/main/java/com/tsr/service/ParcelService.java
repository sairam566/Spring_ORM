package com.tsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsr.entities.Parcel;
import com.tsr.repositorys.ParcelRepository;
import com.tsr.repositorys.ParcelView;

@Service
public class ParcelService {

	@Autowired
	private ParcelRepository parcelRepository;

	@Transactional(readOnly = true)
	public List<Parcel> getAllParcelDeliveredByAssociate(String name) {
		return parcelRepository.getAllParcelDeliveredByAssociate(name);
	}
	
	@Transactional(readOnly = true)
	public List<ParcelView> findByParcelNo(int id){
		return parcelRepository.findByParcelNo(id);
	}

}
