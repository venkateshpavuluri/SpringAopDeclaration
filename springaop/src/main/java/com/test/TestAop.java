package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.customer.bo.CustomerBo;

public class TestAop {
	public static void main(String[] args)throws Exception {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerBo customer = (CustomerBo) applicationContext.getBean("customerBo");
		customer.addCustomerAround("Welcome");
		customer.addCustomer();
		customer.addCustomerThrowException();
		System.out.println("Done");
	}

}
