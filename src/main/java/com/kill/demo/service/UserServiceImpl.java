package com.kill.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void sleep(){
		System.out.println("睡眠睡眠");
	}
}

