package com.example.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
private Object object;
public DynamicProxy(Object object) {
	this.object=object;
}
public Object invoke(Object proxy,Method method,Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	System.out.println("before");
	method.invoke(object, args);
	System.out.println("after");
	return null;
}
}
