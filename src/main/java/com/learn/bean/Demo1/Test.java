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
 *
 * 1 spring的bean实际上是缓存在ConcurrentHashMap中
 * 2 在创建bean之前首选需要将该bean的创建标示定好，标示该bean已经或是正在被创建，为了增加缓存效率
 * 3 根据bean的scope属性来确定bean是Singleton还是prototype
 * 4 通过反射来创建bean的实例，在创建之前首先检查访问修饰符，如果不是public的，则调用setAccessible(true)来突破java先知来创建bean实例
 * 5 接下来寻找bean的属性值完成属性的注入
 * 6 将创建出的Singleton对象放入缓存中
 */

public class Test {

    public static void main(String[] args) {

        ClassPathResource classPathResource = new ClassPathResource("Demo1beans.xml");

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);

//        Person person1 = defaultListableBeanFactory.getBean(Person.class);

        Person person = (Person) defaultListableBeanFactory.getBean("person");

        Person person2 = defaultListableBeanFactory.getBean(Person.class);

//        person1.setName("1");
//
//        System.out.println(person1.say());
//
//        System.out.println(person1 == person2);
    }
}
