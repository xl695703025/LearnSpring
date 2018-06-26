package com.yuxia.serviceAnno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//声明这是一个组件,相当于在配置文件中配置了<bean>,如果不声明，则要手动配置
@Component
//声明为切面类
@Aspect
public class MyAspectAnno {

	//配置切入点
	@Pointcut("execution(* com.yuxia.serviceAnno.*.*(..))")
	public void myPointCut(){};
	//配置前置通知
	@Before("myPointCut()")
	public void before(JoinPoint joinpoint){
		System.out.println("前置通知");
	}
	//配置环绕通知
	@Around("myPointCut()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕前");
		joinPoint.proceed();
		System.out.println("环绕后");
	}
}
