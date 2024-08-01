package com.keyclockPractice.keycloak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.keycloak.adapters.springsecurity.logout.KeycloakLogoutHandler;

@Configuration
public class KeyCloakConfig {

    @Bean
    public LogoutHandler keyCloakLogoutHandler(){
        return new Keycl
    }
}
