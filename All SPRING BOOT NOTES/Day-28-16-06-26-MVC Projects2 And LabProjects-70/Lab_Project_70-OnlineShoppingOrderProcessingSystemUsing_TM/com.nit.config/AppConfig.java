package com.nit.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nit.controller.OrderController;
import com.nit.dao.OrderDAO;
import com.nit.service.OrderService;

@Configuration
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

		ds.setUrl("jdbc:mysql://localhost:3306/shoppingdb");

		ds.setUsername("root");
		ds.setPassword("Subham@123");

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public OrderDAO orderDAO() {
		return new OrderDAO(jdbcTemplate());
	}

	@Bean
	public OrderService orderService() {
		return new OrderService(orderDAO());
	}

	@Bean
	public OrderController orderController() {
		return new OrderController(orderService());
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}
