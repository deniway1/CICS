package com.sun.cics.core.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

public class DataSourceConfig {

//	@Bean
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().build();
//	}
	
	// jndi模式
//	@Bean(destroyMethod="")
//	@ConfigurationProperties(prefix="app.datasource")
//	public DataSource dataSource() throws Exception {
//	    JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//	    return dataSourceLookup.getDataSource("java:comp/env/jdbc/YourDS");
//	}
}
