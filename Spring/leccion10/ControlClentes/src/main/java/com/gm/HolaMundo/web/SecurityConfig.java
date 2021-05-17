package com.gm.HolaMundo.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                    .password("{noop}123")
                    .roles("ADMIN", "USER")//no hace falta poner ROLE_ADMIN porque ya lo pone automáticamente Spring
                
                .and()//para poder añadir otro usuario
                .withUser("user")
                    .password("{noop}123")
                    .roles("USER")
                    
                ;
                    
    }
}
