package com.sub.day38;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.sub.day38")
@PropertySource(
        "classpath:com/sub/day38/application.properties"
)
public class OperationConfig {

    @Autowired
    private Environment environment;

    // =====================================================
    // DATASOURCE
    // =====================================================

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource =
                new DriverManagerDataSource();

        dataSource.setDriverClassName(
                environment.getProperty(
                        "db.driverName"
                )
        );

        dataSource.setUrl(
                environment.getProperty(
                        "db.url"
                )
        );

        dataSource.setUsername(
                environment.getProperty(
                        "db.username"
                )
        );

        dataSource.setPassword(
                environment.getProperty(
                        "db.password"
                )
        );

        return dataSource;
    }

    // =====================================================
    // JDBC TEMPLATE
    // =====================================================

    @Bean
    public JdbcTemplate jdbcTemplate() {

        return new JdbcTemplate(dataSource());
    }
}
