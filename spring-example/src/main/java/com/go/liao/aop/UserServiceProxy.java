package com.go.liao.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceProxy implements InvocationHandler {
	private UserService userService;

	public UserServiceProxy(UserService userService) {
		this.userService = userService;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before method");

		Object invoker = method.invoke(userService, args);

		System.out.println("after method");
		return invoker;
	}
}
