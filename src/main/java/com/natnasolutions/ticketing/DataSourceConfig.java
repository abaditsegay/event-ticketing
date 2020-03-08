package com.natnasolutions.ticketing;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.natnasolutions.ticketing.repository")
@PropertySource(value = { "classpath:database.properties" })
public class DataSourceConfig {

	@Autowired
	private Environment env;

	/*
	 * @Bean(name = "mySqlDataSource")
	 * 
	 * @Primary public DataSource mySqlDataSource() { DataSourceBuilder
	 * dataSourceBuilder = DataSourceBuilder.create();
	 * dataSourceBuilder.driverClassName(env.getRequiredProperty(
	 * "database.driverClass"));
	 * dataSourceBuilder.url(env.getRequiredProperty("database.url"));
	 * dataSourceBuilder.username(env.getRequiredProperty("database.username"));
	 * dataSourceBuilder.password(env.getRequiredProperty("database.password"));
	 * return dataSourceBuilder.build(); }
	 */

	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lfb = new LocalContainerEntityManagerFactoryBean();
		lfb.setDataSource(dataSource());
		lfb.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		lfb.setPackagesToScan("com.natnasolutions.ticketing.model");
		lfb.setJpaProperties(hibernateProperties());
		return lfb;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//dataSource.setDriverClassName(env.getRequiredProperty("database.driverClass"));
		dataSource.setUrl(env.getRequiredProperty("database.url"));
		dataSource.setUsername(env.getRequiredProperty("database.username"));
		dataSource.setPassword(env.getRequiredProperty("database.password"));

		return dataSource;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
		// properties.put("hibernate.format_sql",
		// env.getRequiredProperty("hibernate.format_sql"));

		return properties;
	}

	@Bean
	@Autowired
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());

		return transactionManager;
	}

}
