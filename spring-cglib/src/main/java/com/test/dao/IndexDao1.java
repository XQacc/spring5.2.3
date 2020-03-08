package com.test.dao;

public class IndexDao1 implements Dao {
	public IndexDao1() {
		System.out.println("DAO1");
	}

	@Override
	public void query() {
		System.out.println("DAO1");
	}
}
