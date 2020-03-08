package com.test;

import com.test.com.test.App.Appconfig;
import com.test.mytest.MYgeBeanDefinitionRegistryPostProcessor;
import com.test.mytest.MYgetBeanFactoryPostProcessors;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.register(Appconfig.class);
		ac.addBeanFactoryPostProcessor(new MYgetBeanFactoryPostProcessors());
		ac.addBeanFactoryPostProcessor(new MYgeBeanDefinitionRegistryPostProcessor());
		ac.refresh();
	}
}
