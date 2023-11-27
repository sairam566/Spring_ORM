package com.tsr.helper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyHelper {
	
	@SuppressWarnings("unchecked")
	public static <T> T createProxy(Class<?> classType, InvocationHandler invocationHandler) {
		return (T) Proxy.newProxyInstance(ProxyHelper.class.getClassLoader(), new Class[] {classType}, invocationHandler);
	}
}
