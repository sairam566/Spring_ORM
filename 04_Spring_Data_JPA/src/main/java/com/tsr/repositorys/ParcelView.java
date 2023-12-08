package com.tsr.repositorys;

import org.springframework.beans.factory.annotation.Value;

//Open Projection
public interface ParcelView {
	
	@Value("#{target.description}")
	String getProductDescription();
}
