package com.tsr.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.PropertySource;

@Configurable
@PropertySource("classpath:DB.properties")
public class PersistenceConfig {

	
}
