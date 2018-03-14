package com.artivr.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = {"com.artivr.repository.base"},
        entityManagerFactoryRef="baseEntityManagerFactory",
        transactionManagerRef = "baseTransactionManager"
)
public class BaseConfiguration {

}
