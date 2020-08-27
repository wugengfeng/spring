package com.wgf.service;

import com.wgf.entity.User;

import java.util.UUID;

public class OrderServiceImpl {
	public OrderServiceImpl(User user) {
		System.out.println("OrderServiceImpl");
	}

	public String getOrderNum() {
		return UUID.randomUUID().toString();
	}
}
