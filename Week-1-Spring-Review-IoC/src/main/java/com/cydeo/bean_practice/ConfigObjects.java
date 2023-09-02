package com.cydeo.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigObjects {
    @Bean
//    @Bean(name = "str1") -> once the name been initialized, then the method name cannot be called.
    public String getCydeo(){
        return "Welcome to Cydeo";
    }
    @Bean
//    @Bean(name = "str2")
    public String getSpring(){
        return "Spring Core Practice";
    }

}
