package com.xworkzworldcriminals.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class DBConfiguration {

	public DBConfiguration() {
		System.out.println("Calling Default Constructor of:" + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManager(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan("com.xworkzworldcriminals");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("Getting Data From Browser");
		factoryBean.setDataSource(dataSource);

		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("hibernate.show_sql", true);
		factoryBean.setJpaPropertyMap(jpaProperties);
		return factoryBean;

	}

	@Bean
	public DataSource dataSource() {

		System.out.println("Created DataSource");
		DriverManagerDataSource dataSourse = new DriverManagerDataSource();
		dataSourse.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSourse.setUrl("jdbc:mysql://localhost:3306/worldcriminals");
		dataSourse.setPassword("s1820923");
		dataSourse.setUsername("root");
		return dataSourse;

	}
}