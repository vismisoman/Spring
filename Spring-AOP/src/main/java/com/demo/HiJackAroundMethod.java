package com.demo;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HiJackAroundMethod implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Method Name "+invocation.getMethod().getName());
		System.out.println("Method Arguments  "+Arrays.toString(invocation.getArguments()));
		
		System.out.println("HiJackAroundMethod : Before method Hijacked ");
		try {
			Object result = invocation.proceed();
			return result;
		}catch(IllegalArgumentException e){
			System.out.println("HiJackAroundMethod : Throw exception Hijacked ");
			throw e;
		}
		
	}


}
