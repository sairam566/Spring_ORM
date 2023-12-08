package com.tsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.DeliveryAssociateContactView;
import com.tsr.entities.DeliveryAssociateDetails;
import com.tsr.repositorys.DeliveryAssociateRepository;

@Service
public class DeliveryAssociateService {

	@Autowired
	private DeliveryAssociateRepository associateRepository;

	@Transactional(readOnly = true)
	public List<DeliveryAssociate> getDeliveryAssociateByAge(int age) {
		return associateRepository.getDeliveryAssociateByAge(age);
	}
	
	@Transactional(readOnly = true)
	public List<DeliveryAssociateContactView> findByExp(int exp){
		return associateRepository.findByExperienceEquals(exp);
	}
	
	@Transactional(readOnly = true)
	public List<DeliveryAssociateDetails> getDliveryAssociateDetails(int id){
		return associateRepository.findByDeliveryAssociateNo(id);
	}
}
