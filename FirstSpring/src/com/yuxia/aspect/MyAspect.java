package com.yuxia.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;



public class MyAspect {

	public void before(JoinPoint joinpoint){
		System.out.println("前置通知");
	}
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前");
		joinPoint.proceed();
		System.out.println("环绕后");
	}
}
