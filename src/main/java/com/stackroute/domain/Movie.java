package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor oneActor;
    private String beanName;
    private ApplicationContext context;
    private BeanFactory beanFactory;

    Movie(){}

    // Constructor Injection
    public Movie(Actor oneActor) {
        this.oneActor = oneActor;
    }

    public Actor getOneActor() {
        return oneActor;
    }

    public void setOneActor(Actor oneActor) {
        this.oneActor = oneActor;
    }

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void setBeanName(String s) {
        this.beanName = s;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "oneActor=" + oneActor + " " + beanName +
                '}';
    }
}
