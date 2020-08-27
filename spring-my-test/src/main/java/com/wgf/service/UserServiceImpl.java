package com.wgf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

	public UserServiceImpl() {
		System.out.println("Construct");
	}

	public void send() {
		System.out.println("hello");
	}
}
