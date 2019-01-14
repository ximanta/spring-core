package com.xam;

import com.xam.domain.HelloWorld;
import com.xam.domain.Quote;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext= (ApplicationContext) new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld beanA=(HelloWorld) applicationContext.getBean("helloWorld");
        Quote quote=beanA.getQuote();
        System.out.println(quote.getQuotation() +" by:" + quote.getAuthor());



    }
}
