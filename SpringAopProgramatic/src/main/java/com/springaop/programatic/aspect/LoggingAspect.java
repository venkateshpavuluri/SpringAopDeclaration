package com.springaop.programatic.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	public void beforeLogging(JoinPoint joinPoint)
	{
		System.out.println("Before logging==="+joinPoint.getSignature().getName());
	}
	public void afterLogging(JoinPoint joinPoint)
	{
		System.out.println("after logging==="+joinPoint.getSignature().getName());
	}
	public void aroundLoging(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println("around logging before==="+joinPoint.getSignature().getName());
		joinPoint.proceed();
		System.out.println("around logging after==="+joinPoint.getSignature().getName());
	}
	
	


}
