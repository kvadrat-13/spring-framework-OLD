package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        CommentService c1 = context.getBean(CommentService.class);
//        CommentService c2 = context.getBean(CommentService.class);
//
//        System.out.println("c1 = " + c1);
//        System.out.println("c2 = " + c2);
//
//        System.out.println(c1 == c2);
    }
}
