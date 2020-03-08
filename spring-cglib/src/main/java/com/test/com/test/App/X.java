package com.test.com.test.App;


import com.test.MYImport.MYcommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

//@Repository
@Component
@Import(MYcommon.class)
public class X {
	@Autowired
	private EnvironmentAware environmentAware;
	public X() {
		System.out.println("X test!!!");
	}

	@PostConstruct
	public void init(){
		System.out.println("init----------");
	}
}
