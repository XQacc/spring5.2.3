package test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.dao.Dao;

@Component
public class Test {
	@Autowired
	Dao dao;

	public void test(){
		System.out.println(dao);
	}
}
