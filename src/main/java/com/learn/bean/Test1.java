package com.learn.bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 应用模块名称<p>
 * 代码描述<p>
 *
 * @Author: Yummyxl
 * @Date: 2020/3/2
 *
 * spring 加载资源并装配对象的过程
 * 1 定义好spring的配置文件
 * 2 通过Resource对象将spring的配置文件进行抽象，抽象成一个Resource对象
 * 3 定义好各种BeanFactory
 * 4 定义好 XmlBeanDefinitionReader 对象，并将工厂作为参数传递进去，供后续回调使用
 * 5 通过 XmlBeanDefinitionReader 对象读取之前的 Resource 对象（包含了XMl文件的解析过程）
 * 6 本质上xml文件的解析是由 XmlBeanDefinitionReader 对象交给 BeanDefinitionParserDelegate 委托来完成的 （委托模式）
 * 7 Ioc容器创建完毕，用户可以通过容器获取到对象信息
 *
 * DefaultBeanDefinitionDocumentReader 类中的 doRegisterBeanDefinitions 方法使用了经典的模板方法设计模式，子类可以重写
 * preProcessXml 和 postProcessXml 方法，实现xml配置类的自定义扩展， 类似于 JUnit 的 setUp test*** tearDown 实现方式。
 */

public class Test1 {

    public static void main(String[] args) {

//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Test1 test1 = (Test1) xmlBeanFactory.getBean("test1");

        // 设置好类路径 定位 ，设置好类加载器
        ClassPathResource classPathResource = new ClassPathResource("beans.xml");

        // 构造对象
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        // 准备好reader
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

        // 加载 bean 定义
        xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
    }
}
