package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//Task 1:
//        Create a Maven project and add required dependency of spring-context 5.1.4.RELEASE
//        Create a Main class in package com.stackroute and two Spring Beans – Movie, and Actor in
//        package com.stackroute.domain.
//        Actor has two String properties, name and gender, and an age property of type int.
//        An Actor can be initialized with the three properties via the corresponding setter methods. Use
//        property based injection in the bean definition file (beans.xml)
//        Movie “has a” Actor that can be initialized via the corresponding setter method. Use property
//        based object injection in the bean definition file (beans.xml)
//        The Main class looks up Movie bean via three ways to print out actor information:
//        1. Using XmlBeanFactory
//        2. Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
//        3. Using ApplicationContext
//        Create a spring-xml-demo repo and push the code to master branch.


@SuppressWarnings("deprecation")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);


        // Using XmlBeanFactory
        Resource resource = new ClassPathResource("Beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Movie m1 = factory.getBean("movie1",Movie.class);
        System.out.println("\n Movie Details using XmlBeanFactory: " + m1);

        // Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Movie m2 = (Movie) context.getBean("movie1");
        System.out.println("Movie Details using ApplicationContext: " + m2);

        // Using Spring BeanDefinitionRegistry and BeanDefinitionReader
//        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry)context;
//        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);

    }
}
