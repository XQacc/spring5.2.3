package com.test.dao;

public class IndexDao3 implements Dao {
	public IndexDao3() {
		System.out.println("DAO3");
	}

	@Override
	public void query() {
		System.out.println("DAO3");
	}
}
