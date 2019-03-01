package com.stackroute.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Task 2:
//        From the master branch of spring-xml-demo repo create a constructor-injection
//        branch.
//        Add constructor to the Actor class to initialize with name and gender, and age
//        Create three beans of type Actor in the bean definition file.
//        Use constructor-based injection in the bean definition file (beans.xml) to inject property values in
//        each of the three beans via name, index, and type respectively.
//        For the Movie bean, use constructor based object injection in the bean definition file
//        (beans.xml) to inject an Actor bean.
//        In the Main class, look up Movie bean using ApplicationContext and print out Author
//        information.
//        Use the same ApplicationContext to again look up the same Movie bean.
//        Print out the equality result of the two Movie beans.
//        System.out.println(beanA==beanB);
//        Change the scope of the Movie bean in beans.xml to prototype and run the application again.
//        Note the output.
//        Replace id of the Movie bean with name having two values, like this:
//        <bean name=”MovieA, MovieB” ........>
//        Update the code in Main to get the Movie bean by its two different name.
//        Push the code to constructor-injection branch.


@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Movie m1 = (Movie) context.getBean("movieA");
        System.out.println("Movie 1 Details : " + m1);

        Movie m2 = (Movie) context.getBean("movieB");
        System.out.println("Movie 2 Details : " + m2);

        // Equality of two movie beans
        System.out.println(m1 == m2);

    }
}
