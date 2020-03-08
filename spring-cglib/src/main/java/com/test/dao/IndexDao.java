package com.test.dao;

public class IndexDao implements Dao {

	public IndexDao() {
		System.out.println("DAO");
	}

	@Override
	public void query() {
		System.out.println("DAO");
	}
}
