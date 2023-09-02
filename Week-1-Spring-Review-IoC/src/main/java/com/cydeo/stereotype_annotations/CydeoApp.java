package com.cydeo.stereotype_annotations;

import com.cydeo.stereotype_annotations.config.ConfigSubjects;
import com.cydeo.stereotype_annotations.model.DataStructure;
import com.cydeo.stereotype_annotations.model.DevOps;
import com.cydeo.stereotype_annotations.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSubjects.class);

        DataStructure dataStructure = context.getBean(DataStructure.class);
        dataStructure.getTotalHours();

        Microservice microservice = context.getBean(Microservice.class);
        microservice.getTotalHours();

//        DevOps devOps = context.getBean(DevOps.class);
//        devOps.getTotalHours();
    }
}
