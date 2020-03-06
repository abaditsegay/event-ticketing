package com.natnasolutions.ticketing;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value = { "classpath:database.properties" })
@ComponentScan({ "com.natnasolutions" })
public class DataSourceConfig {

	@Autowired
	private Environment env;

	@Bean(name = "mySqlDataSource")
	@Primary
	public DataSource mySqlDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(env.getRequiredProperty("database.driverClass"));
		dataSourceBuilder.url(env.getRequiredProperty("database.url"));
		dataSourceBuilder.username(env.getRequiredProperty("database.username"));
		dataSourceBuilder.password(env.getRequiredProperty("database.password"));
		return dataSourceBuilder.build();
	}

}
