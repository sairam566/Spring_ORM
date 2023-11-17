package com.tsr.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

@Configurable
@PropertySource("classpath:DB.properties")
@ComponentScan(basePackages = {"com.tsr.dao"})
public class PersistenceConfig {

	@Bean
	public DataSource dataSource(@Value("${db.driverClassName}") String className, @Value("${db.url}") String url,
			@Value("${db.user}") String userName, @Value("${db.password}") String password) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(className);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean(DataSource dataSource, @Value("${show_sql}") String showSQL,
			@Value("${hbm2ddl.auto}") String hbm2ddl,@Value("${hibernate.dialect}") String dialect) {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("show_sql", showSQL);
		hibernateProperties.put("hbm2ddl.auto", hbm2ddl);
		hibernateProperties.put("hibernate.dialect", dialect);
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setHibernateProperties(hibernateProperties);
		sessionFactory.setPackagesToScan("com.tsr.entities");
		return sessionFactory;
	}
	
	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
		return new HibernateTemplate(sessionFactory);
	}
	
	@Bean
	public PlatformTransactionManager platformTransactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}
	
}
