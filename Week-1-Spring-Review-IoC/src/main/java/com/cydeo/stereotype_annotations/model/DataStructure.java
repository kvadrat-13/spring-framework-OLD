package com.cydeo.stereotype_annotations.model;

import org.springframework.stereotype.Component;

@Component
public class DataStructure {
    public void getTotalHours(){
        System.out.println("Total hours : " + 10);
    }
}
