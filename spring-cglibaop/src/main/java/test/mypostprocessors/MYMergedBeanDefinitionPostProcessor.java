package test.mypostprocessors;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
public class MYMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	//第三次
	//缓存bean的注入信息的后置处理器，仅仅是缓存或者干脆叫做查找更加合适，没有完成注入，注入是另外一个后置处理器的作用
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if(beanName.equals("daoImpl")){
			System.out.println("缓存daoImpl的相关信息");
		}
	}
}
