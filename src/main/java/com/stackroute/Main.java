package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//Task 4:
//        From the autowire-xml branch of spring-xml-demo repo create an aware-interface
//        branch.
//        Implement ApplicationContextAware, BeanFactoryAware, BeanNameAware in the
//        Movie class and print out their results.
//        Push the code to aware-interface branch.

@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {

     ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
     ((ClassPathXmlApplicationContext) context).registerShutdownHook();

     Movie m1 = context.getBean("movie1",Movie.class);
     m1.setApplicationContext(context);

     XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
     m1.setBeanFactory(factory);
     m1.setBeanName("Movie 1 Bean");
        System.out.println("\nMovie 1 is : "+ m1);
    }
}
