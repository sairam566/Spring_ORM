package com.tsr.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tsr.entities.Parcel;

public interface ParcelRepository extends JpaRepository<Parcel, Integer>{
	
	@Query(value="from Parcel p where p.deliveryAssociate.associateName = ?1")
	public List<Parcel> getAllParcelDeliveredByAssociate(String name);
	
	//Open Projection
	public List<ParcelView> findByParcelNo(int id);
}
