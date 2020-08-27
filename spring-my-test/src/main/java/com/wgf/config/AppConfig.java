package com.wgf.config;

import com.wgf.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.wgf")
public class AppConfig {

	@Bean
	public User user() {
		return new User();
	}
}
