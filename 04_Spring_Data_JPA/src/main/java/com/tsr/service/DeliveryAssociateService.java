package com.tsr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsr.entities.DeliveryAssociate;
import com.tsr.repositorys.DeliveryAssociateRepository;

@Service
public class DeliveryAssociateService {

	@Autowired
	private DeliveryAssociateRepository associateRepository;

	@Transactional(readOnly = true)
	public List<DeliveryAssociate> getDeliveryAssociateByAge(int age) {
		return associateRepository.getDeliveryAssociateByAge(age);
	}
}
