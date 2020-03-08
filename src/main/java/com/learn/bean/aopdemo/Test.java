package com.learn.bean.aopdemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 *
 * @Author: Yummyxl
 * @Date: 2020/3/6
 */

public class Test {

    public static void main(String[] args) {
//
//        ClassPathResource classPathResource = new ClassPathResource("AopDemo.xml");
//
//        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
//
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
//
//        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
//
//        Dao dao = (Dao) defaultListableBeanFactory.getBean("dao");
//
//        dao.insert();


        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("AopDemo.xml");
        Dao dao = (Dao) classPathXmlApplicationContext.getBean("dao");
        dao.insert();

    }
}
