package com.test.com.test.App;

import com.test.MYImport.MYImportBeanDefinitionRegistrar;
import com.test.dao.Dao;
import com.test.dao.IndexDao;
import com.test.dao.IndexDao1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@ComponentScan("com.test")
//@Scope("prototype")
@Configuration
@Primary
@Import(MYImportBeanDefinitionRegistrar.class)
public class Appconfig {

	@Bean
	public Dao indexDao(){return  new IndexDao();
	}


	@Bean
	public Dao indexDao1(){
		indexDao();
		return new IndexDao1();
	}
}
