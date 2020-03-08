package test.mypostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;

@Component
public class MYBeanPostProcessor implements BeanPostProcessor {
	//第七次
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("daoService")) {
			System.out.println("you can modify DaoService before initialization");
		}
		return bean;
	}
	//第八次
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("daoService")) {
			System.out.println("you can modify DaoService after initialization");
		}
		return bean;
	}
}
