package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track {
    @Pointcut("execution(* Operations.m*(..))")
	public void k() {} //Pointcut name
    
    @Before("k()") //applying pointcut before advice
	public void myAdvice(JoinPoint jp) { //it is advice (before advice)
		
		System.out.println(" Additional concern");
		//System.out.println(" Method Signature "+jp.getSignature());
	}
}
