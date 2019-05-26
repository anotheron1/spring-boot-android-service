package com.example;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

public class MainConfig {
    @Value("${spring.datasource.driver-class-name}")
    private String dataSourceClassName;

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${spring.datasource.username}")
    private String dataSourceUsername;

    @Value("${spring.datasource.password}")
    private String dataSourcePassword;

    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDataSourceClassName(dataSourceClassName);
        dataSource.setDataSourceProperties(getDataSourceProperties());

        return dataSource;
    }

    private Properties getDataSourceProperties() {
        Properties properties = new Properties();
        properties.setProperty("url", dataSourceUrl);
        properties.setProperty("user", dataSourceUsername);
        properties.setProperty("password", dataSourcePassword);

        return properties;
    }
}
