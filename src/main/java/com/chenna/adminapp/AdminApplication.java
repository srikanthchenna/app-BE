package com.chenna.adminapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
// @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
// DataSourceTransactionManagerAutoConfiguration.class,
// HibernateJpaAutoConfiguration.class })
@ComponentScan(basePackages={"com.chenna.adminapp"})
public class AdminApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
	

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdminApplication.class);
    }
}
