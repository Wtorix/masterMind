package com.gamingservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;

@Configuration
public class WebConfig {
    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }
}
