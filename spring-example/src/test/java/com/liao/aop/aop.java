package com.liao.aop;

import com.go.liao.aop.UserService;
import com.go.liao.aop.UserServiceProxy;
import com.go.liao.aop.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

public class aop {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();

		UserServiceProxy userServiceProxy = new UserServiceProxy(userService);

		UserService userService1 = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(),
				userServiceProxy);

		userService1.userInfo();
	}
}
