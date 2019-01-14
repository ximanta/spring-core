package com.xam.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld  implements ApplicationContextAware, BeanFactoryAware, BeanNameAware{
    private Quote quote;
    ApplicationContext applicationContext;

    public HelloWorld() {
    }
    public HelloWorld(Quote quote) {
        this.quote = quote;
    }
    public Quote getQuote() {
        return quote;
    }
    public void setQuote(Quote quote) {
        this.quote = quote;
    }
    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name: "+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
     this.applicationContext=applicationContext;
     HelloWorld helloWorld=(HelloWorld) applicationContext.getBean("helloWorld");
     System.out.println(helloWorld);
     Quote quote=(Quote) applicationContext.getBean("quote");
     System.out.println(quote);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory = [" + beanFactory + "]");
    }
    @Override
    public String toString() {
        return "HelloWorld{" +
                "quote=" + quote +
                ", applicationContext=" + applicationContext +
                '}';
    }

}
