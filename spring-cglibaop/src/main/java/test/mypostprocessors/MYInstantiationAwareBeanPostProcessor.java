package test.mypostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class MYInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	/**
	 * spring第一次调用后置处理器的方法
	 * 这个方法是在实例化之前产生作用，当这个方法不返回null的时候，就会直接调用BeanPostProcessor的postProcessAfterInitialization方法然后直接返回出去
	 * 这样就跳过了中间的许多步骤（如推断构造方法，自动装配）
	 * 如果这个方法返回null，则会按照spring的流程继续走下去
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if(beanName.equals("daoService"))
			System.out.println("aaaaaaaa");
//		return Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{MYService.class},new MYInvocationHandler());
		return null;
	}

	/**
	 * 第五次
	 * 这个方法是在实例化之后产生作用，由于返回的值是bool类型
	 * 判断是否需要对属性的填充或修改（@Autowired要不要管）
	 * @param bean the bean instance created, with properties not having been set yet
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if(beanName.equals("test"))
			System.out.println("postProcessAfterInstantiation----"+beanName);
		return true;
	}
	//设置属性值，第六次
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if(beanName.equals("test")) {
			System.out.println("postProcessProperties----" + beanName);
		}
		return null;
	}
}
