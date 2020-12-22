package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Value("${spring.datasource.url}")
    private String dataSourceURL;

    @Value("${spring.datasource.username}")
    private String dataSourceUserName;

    @Value("${spring.datasource.password}")
    private String dataSourcePassword;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(dataSourceURL);
        builder.username(dataSourceUserName);
        builder.password(dataSourcePassword);
        System.out.println("My custom data-source bean has been initialized and set");
        return builder.build();
    }

}
