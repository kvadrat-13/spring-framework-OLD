
package com.cydeo.bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigEmployee.class, ConfigObjects.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();

        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();

//        String configObjects1 = container.getBean("str1",String.class);
        String configObjects2 = container.getBean("getCydeo",String.class);

//        String configObjects3 = container.getBean("str2",String.class);
        String configObjects4 = container.getBean("getSpring",String.class);

//        System.out.println(configObjects1);
        System.out.println(configObjects2);

//        System.out.println(configObjects3);
        System.out.println(configObjects4);


    }
}
