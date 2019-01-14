package com.xam.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleDemoBean implements InitializingBean, DisposableBean {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle bean has been terminated");

    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
