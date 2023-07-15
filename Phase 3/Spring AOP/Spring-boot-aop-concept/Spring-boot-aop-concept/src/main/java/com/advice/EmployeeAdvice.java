package com.advice;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect			// This class provide all advice details 
public class EmployeeAdvice {

	@Pointcut("execution(public String com.service.MyService.businessMethod(..))")
	public void myPointCut() {
		//System.out.println("point cut");
	}
	
	@Pointcut("execution(public String com.service.MyService.div(..))")
	public void myPointCut1() {
		//System.out.println("point cut");
	}
//	@Before("myPointCut()")
//	public void beforeMethod() {
//		System.out.println("This code execute before business method "+LocalDateTime.now());
//	}
//	
//	@After("myPointCut()")
//	public void afterMethod() {
//		System.out.println("This code execute after business method "+LocalDateTime.now());
//	}
	
//	@Around("myPointCut()")
//	public void aroundAdvice(ProceedingJoinPoint p) {
//		System.out.println("Before method invocation");
//		try {
//			p.proceed();		// call actual business method 
//		} catch (Throwable e) {
//			// TODO: handle exception
//		}
//		System.out.println("After method invocation");
//	}
	@AfterThrowing("myPointCut1()")
	public void afterThrowException() {
		System.out.println("After exception generate");
	}
}
