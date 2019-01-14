package com.xam;

import com.xam.domain.HelloWorld;
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
////        HelloWorld obj = new HelloWorld();
////        System.out.println(obj.getMessage());
//
//        BeanFactory factory = new XmlBeanFactory (new ClassPathResource("beans.xml"));
//        HelloWorld beanA = (HelloWorld) factory.getBean("helloWorld");
//        System.out.println(beanA.getMessage());
//        System.out.println(beanA.getQuote());
//
//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        HelloWorld beanC=(HelloWorld) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("helloWorld");
//        System.out.println(beanC.getMessage());
//        System.out.println(beanA.getQuote());

        ApplicationContext applicationContext= (ApplicationContext) new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld beanA=(HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(beanA.getMessage());
        System.out.println(beanA.getQuote());

        HelloWorld beanB=(HelloWorld) applicationContext.getBean("helloWorld");

        System.out.println(beanA==beanB);


    }
}
