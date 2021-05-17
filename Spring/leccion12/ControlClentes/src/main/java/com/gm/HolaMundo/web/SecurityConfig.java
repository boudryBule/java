package com.gm.HolaMundo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    //en vez de crear usuarios con el inmemoryAuthentication vamos a usar la implementación de jpa
   @Autowired
   private UserDetailsService userDetailsService;
   
   
   //ahora indicamos el tipo de encripción que vamos a utilizar
   @Bean
   public BCryptPasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
   }
   
   //creamos un metodo para indicar que vamos a usar la  implementación de userDetailsService y también el tipo de condificación passwordEncoder
   
   @Autowired
   public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception{
       build.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
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
