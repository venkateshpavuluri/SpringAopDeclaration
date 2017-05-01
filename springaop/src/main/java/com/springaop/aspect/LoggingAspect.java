package com.springaop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Around("execution(* com.springaop.customer.bo.CustomerBo.addCustomerAround(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");
		
		System.out.println("******");

	}
	@Before("execution(* com.springaop.customer.bo.CustomerBo.addCustomer())")
	public void logBefore(JoinPoint joinPoint) throws Throwable {

		System.out.println("addCustomer() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("after before is running!");
		
		System.out.println("******");

	}
	
	@Around("execution(* com.springaop.customer.bo.CustomerBo.addCustomerAround(..))")
	public void logafterThrowing(ProceedingJoinPoint joinPoint) throws Throwable {

		//System.out.println("addCustomerThrowException() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("before arround=====");
		joinPoint.proceed();
		System.out.println("after arround====");
		System.out.println("after addCustomerThrowException is running!");
		
		System.out.println("******");

	}
	@AfterThrowing("execution(* com.springaop.customer.bo.CustomerBo.addCustomerThrowException())")
	public void logafterThrowing(JoinPoint joinPoint) throws Throwable {

		System.out.println("addCustomerThrowException() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("after addCustomerThrowException is running!");
		
		System.out.println("******");

	}

@Before("execution(* com.springaop.customer.bo.CustomerBo.*(..))")
public void logBeforeforAllmethodsanotherpackage(JoinPoint joinPoint) throws Throwable {

	System.out.println("addCustomer() is running!");
	System.out.println("hijacked method : " + joinPoint.getSignature().getName());
	System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
	
	System.out.println("after before is running!");
	
	System.out.println("******");

}
@Before("within(com.springaop..*)")
public void logBeforeforAllmethodssamepackage(JoinPoint joinPoint) throws Throwable {

	System.out.println("addCustomer() is running!");
	System.out.println("hijacked method : " + joinPoint.getSignature().getName());
	System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
	
	System.out.println("after before is running!");
	
	System.out.println("******");

}
@Before("bean(*CustomerBo)")
public void logBeforeforAllmethodsinclass(JoinPoint joinPoint) throws Throwable {

	System.out.println("addCustomer() is running!");
	System.out.println("hijacked method : " + joinPoint.getSignature().getName());
	System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
	
	System.out.println("after before is running!");
	
	System.out.println("******");

}

}		