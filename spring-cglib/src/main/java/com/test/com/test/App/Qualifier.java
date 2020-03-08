package com.test.com.test.App;

import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Component
public class Qualifier implements Annotation {
	@Override
	public Class<? extends Annotation> annotationType() {
		return null;
	}
}