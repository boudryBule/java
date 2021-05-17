package com.gm.HolaMundo.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/editar/**", "/agregar/**", "/eliminar") //con /** queremos indicar que se va a restringir el path con todo lo que venga posteriormente
                    .hasRole("ADMIN")
                .antMatchers("/") //Path raiz, el que muestra la lista de personas
                    .hasAnyRole("USER", "ADMIN") //Como son varios usamos el hasany
                
                .and()
                    .formLogin()
                    .loginPage("/login")
                
                .and()
                    .exceptionHandling().accessDeniedPage("/errores/403")
                ;
    }
}
