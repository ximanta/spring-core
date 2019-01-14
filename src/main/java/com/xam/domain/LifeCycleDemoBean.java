package com.xam.domain;

import org.springframework.beans.factory.*;

public class LifeCycleDemoBean implements InitializingBean, DisposableBean {
    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has been initialized and its properties set!");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("## The Lifecycle bean has been terminated");
    }
    public void customInit(){
        System.out.println("##customInit: The LifeCycleBean has been initialized!");
    }
    public void customDestroy(){
        System.out.println("##customDelete: The LifeCycleBean has been terminated!");
    }

}
