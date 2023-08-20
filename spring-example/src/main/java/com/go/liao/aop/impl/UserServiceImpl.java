package com.go.liao.aop.impl;

import com.go.liao.aop.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
	@Override
	public void userInfo() {
		System.out.println("userInfo");
	}
}
