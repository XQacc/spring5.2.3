package test.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import test.config.Test;

@Component
public class DaoImpl implements Dao {
	@Autowired
	Test test;
//	public DaoImpl() {
//	}
//
//	public DaoImpl(String s) {
//	}

	@Override
	public void query() {
		System.out.println("DaoImpl");
	}
}
