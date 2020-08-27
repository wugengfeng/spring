package com.wgf;

import com.wgf.config.AppConfig;
import com.wgf.service.OrderServiceImpl;
import com.wgf.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/*UserServiceImpl service = context.getBean(UserServiceImpl.class);
		UserServiceImpl service2 = context.getBean(UserServiceImpl.class);
		System.out.println(service.hashCode());
		System.out.println(service2.hashCode());

		OrderServiceImpl orderService = context.getBean(OrderServiceImpl.class);
		System.out.println(orderService.getOrderNum());*/
		context.getBean(UserServiceImpl.class);

	}
}
