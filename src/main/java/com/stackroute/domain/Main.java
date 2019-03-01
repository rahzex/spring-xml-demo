package com.stackroute.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Task 3:
//        From the constructor-injection branch of spring-xml-demo repo create a
//        autowire-xml branch.
//        For the Movie bean, delete the constructor based object injection in the bean definition file
//        (beans.xml) that injects an Actor bean.
//        Use autowire byName in the Movie bean to inject an Actor bean.
//        Run the application.
//        Create another Movie bean and try autowire byType.
//        Run the application and note the exception thrown.
//        Fix the Movie bean by removing autowire byType and using constructor injection instead.
//        Push the code to autowire-xml branch.

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Movie m1 = (Movie) context.getBean("movie1");
        System.out.println("Movie 1 Details : " + m1);

        Movie m2 = (Movie) context.getBean("movie2");
        System.out.println("Movie 2 Details : " + m2);

    }
}
