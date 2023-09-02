package com.cydeo.stereotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
//@Data -> will not work on its own, because of NullPointerException being thrown during RunTime
@Data
public class DataStructure {

//    @NonNull -> can be worked with @Data where it will add additional parameter where it will say cannot be null
    @NonNull
    ExtraHours extraHours;

    public void getTotalHours(){
        System.out.println("Total hours : " + (10 + extraHours.getHours()));
    }

    /*
    @Autowired -> is a Dependency Injection that can be called through a constructor ->
    -> or can be called IMPLICITLY through lombok annotation that will generate constructor with @AllArgsConstructor
     */
//    @Autowired
//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }
}
