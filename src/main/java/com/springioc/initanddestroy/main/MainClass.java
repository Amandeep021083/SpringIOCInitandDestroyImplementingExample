package com.springioc.initanddestroy.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.initanddestroy.beans.User;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.getName());
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
