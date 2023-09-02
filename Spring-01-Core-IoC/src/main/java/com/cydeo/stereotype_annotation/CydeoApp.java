package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext ap = new AnnotationConfigApplicationContext(ConfigCourse.class);

        ap.getBean(Agile.class).getTeachingHours();
        ap.getBean(Java.class).getTeachingHours();
//        ap.getBean(Selenium.class).getTeachingHours();// through an exception because there is no @Component annotation in Selenium class


    }
}
