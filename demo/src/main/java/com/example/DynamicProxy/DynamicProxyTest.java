package com.example.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
public static void main(String[] args) {
	Iuser user=new Impl();
	InvocationHandler h=new DynamicProxy(user);
	Iuser proxy=(Iuser)Proxy.newProxyInstance(h.getClass().getClassLoader(),new Class[] {Iuser.class}, h);
	proxy.eat("cake");
}
}
