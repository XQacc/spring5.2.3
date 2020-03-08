package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.config.Appconfig;
import test.config.Test;
import test.dao.Dao;
import test.dao.DaoImpl;
import test.service.DaoService;
import test.service.MYService;

import java.io.IOException;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Appconfig.class);
		annotationConfigApplicationContext.refresh();
//		System.out.println((Dao)(annotationConfigApplicationContext.getBean("daoImpl")));
		((Test)annotationConfigApplicationContext.getBean("test")).test();

	}
}
