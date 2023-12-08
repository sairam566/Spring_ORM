package com.tsr.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tsr.entities.DeliveryAssociate;
import com.tsr.entities.DeliveryAssociateContactView;

public interface DeliveryAssociateRepository extends JpaRepository<DeliveryAssociate, Integer> {

	@Query(value = "from DeliveryAssociate del where experience >= ?1")
	public List<DeliveryAssociate> getDeliveryAssociateByAge(int age);
	
	//Closed Projection
	public List<DeliveryAssociateContactView> findByExperienceEquals(int exp);
}
