package com.chenna.adminapp.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.chenna.adminapp.dao")
public class PersistenceConfig {

}
