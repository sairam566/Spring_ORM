package com.tsr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DAOConfig.class,ServiceConfig.class})
public class RootConfig {

}
