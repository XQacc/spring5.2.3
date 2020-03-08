package test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.ConstructorAccessor;
import test.dao.Dao;

import java.util.HashMap;
import java.util.Map;

@Service
public class DaoService implements MYService{

	@Autowired
	Map<String, Dao> map=new HashMap<>();
	public DaoService() {
		System.out.println("DaoService Constructor");
	}

	@Override
	public void testService(String str){
		if(str=="A"){
			map.get("daoImpl").query();
		} else if(str=="B"){
			map.get("daoImpl1").query();
		}
	}
}
