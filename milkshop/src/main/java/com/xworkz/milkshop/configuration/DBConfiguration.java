package com.xworkz.milkshop.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {
		System.out.println("Created DB Configuration..."+ this.getClass().getSimpleName());
	}

// persistence.xml
	// factory--- datasource
	// packages to scan: @Entity
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManager(DataSource dataSource) {

		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan("com.xworkz");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("getting data source from spring ");
		factoryBean.setDataSource(dataSource);

		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("hibernate.show_sql", true);
		
		factoryBean.setJpaPropertyMap(jpaProperties);
		return factoryBean;

	}

	// persitence.xml : db properties ---> Connection
	@Bean
	public DataSource dataSource() {
		System.out.println("created datasource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/milkshop");
		dataSource.setPassword("s1820923");
		dataSource.setUsername("root");
		return dataSource;
	
}
}


		
		