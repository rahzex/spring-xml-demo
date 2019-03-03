package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Running Initializing Bean method afterPropertiesSet().");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Running DisposableBean method destroy().");
    }

    public void customInit(){
        System.out.println("This is customInit method.");
    }

    public void customDestroy(){
        System.out.println("This is customDestroy method");
    }
}
