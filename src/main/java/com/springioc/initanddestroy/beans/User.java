package com.springioc.initanddestroy.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean,DisposableBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setter");
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init method");
	}

}
