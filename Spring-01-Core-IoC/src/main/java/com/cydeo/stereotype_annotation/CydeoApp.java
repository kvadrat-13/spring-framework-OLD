package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext ap = new AnnotationConfigApplicationContext(ConfigCourse.class);

        Agile agile = ap.getBean(Agile.class);
        agile.getTeachingHours();

    }
}
