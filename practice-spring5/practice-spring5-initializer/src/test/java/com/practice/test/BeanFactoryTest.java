package com.practice.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 显示调用bean工厂加载测试
 *
 * @author cuilongcan <cui.longcan@chinaott.net>
 * @create 2019-12-23
 */
public class BeanFactoryTest {
    @Test
    public void loadCustomBean(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(""));
    }
}
