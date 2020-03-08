package test.mypostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
import test.dao.Dao;
import test.dao.DaoImpl;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

//@Component
public class MYSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	//预测最终从这个处理器的回调返回的bean的类型。
	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
//		return String.class;
		if(beanName.equals("daoImpl"))
			System.out.println("predictBeanType");
		return null;
	}
	//第二次调用
	//确定要用于给定bean的候选构造函数。
	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		if(beanName.equals("daoImpl")) {
			System.out.println("determineCandidateConstructors");
			Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
			List<Constructor<?>> constructors = new ArrayList<>(declaredConstructors.length);
			for (java.lang.reflect.Constructor<?> declaredConstructor : declaredConstructors) {
				constructors.add(declaredConstructor);
			}
			List<Constructor<?>> constructor=new ArrayList<>();
			Constructor<?> temp = constructors.get(1);
			constructor.add(temp);
			return constructor.toArray(new Constructor<?>[0]);
//			Constructor<?>[] declaredConstructor =declaredConstructors[0];
		}
		return null;
	}
	/**
	 * 第四次
	 *获取对指定bean的早期访问的引用，通常用于解析循环引用。
	 * 这个回调函数将会给后置处理器一个早点暴露一个wrapper的机会，也就是说，在目标的bean实例完全初始化之前。
	 *所暴露的对象在某些方面应该等价于postProcessBeforeInitialization和postProcessAfterInitialization这个对象。
	 * 注意被方法返回的对象将会被用于bean的引用除非从被定义的post-processor调用返回了不一样的wrapper，换句话说，
	 *这些post-processor调用可能最终使用了相同的引用或者从那些后来的回调中返回了原生的bean实例
	 * （如果受影响bean的wrapper已经为调用此方法而构建，默认情况下会被当成最终的暴露bean引用）
	 * @param bean the raw bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		if(beanName.equals("test"))
			System.out.println("getEarlyBeanReference-----"+beanName);
		return bean;
	}
}
