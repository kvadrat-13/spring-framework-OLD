package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
@ComponentScan -> is used to specify the base package(s) for Spring to scan for components,
such as @Component, @Service, @Repository, and @Controller annotations. If the classes are located out of the package,
then (basePackages = "com.cydeo") can be specified in parameters.
*/
//@ComponentScan
public class ConfigEmployee {
    @Bean
    FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean
    PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
