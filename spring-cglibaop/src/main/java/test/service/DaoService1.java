package test.service;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import test.dao.Dao;

@Service
public class DaoService1 implements ApplicationContextAware,MYService {

	private ApplicationContext applicationContext;
	public void testService(String str){
		if(str=="A"){
			((Dao)applicationContext.getBean("daoImpl")).query();
		}else if(str=="B"){
			((Dao)applicationContext.getBean("daoImpl1")).query();
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			this.applicationContext=applicationContext;
	}
}
