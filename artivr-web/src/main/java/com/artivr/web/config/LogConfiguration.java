package com.artivr.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages ={"com.artivr.repository.log"},
        entityManagerFactoryRef="logEntityManagerFactory",
        transactionManagerRef = "logTransactionManager"
)
public class LogConfiguration {

}
