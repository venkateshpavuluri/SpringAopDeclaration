package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.CustomerImpl;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerImpl customer = (CustomerImpl) applicationContext.getBean("customerBo");
		customer.addCustomer();
		System.out.println("Done");
	}

}
