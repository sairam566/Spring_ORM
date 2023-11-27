package com.tsr.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AuthenticationInvocationHandler implements InvocationHandler{
	
    private final Object target;
    
	public AuthenticationInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.print("Proxy : "+proxy.getClass().getCanonicalName()+"\nMethod Name : "+method.getName()+"\nArguments : ");
		for (Object object : args) {
			System.out.print(object+" ");
		}
		System.out.println("\n");
		
		Object obj = method.invoke(target, args);
		
		return obj;
	}

}
