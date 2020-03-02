package com.learn.bean.Demo1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 *
 * @Author: Yummyxl
 * @Date: 2020/3/2
 */

public class Test {

    public static void main(String[] args) {

        ClassPathResource classPathResource = new ClassPathResource("Demo1beans.xml");

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);

        Person person1 = defaultListableBeanFactory.getBean(Person.class);

        Person person2 = defaultListableBeanFactory.getBean(Person.class);

        person1.setName("1");

        System.out.println(person1.say());

        System.out.println(person1 == person2);
    }
}
