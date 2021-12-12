package com.jamie;

import com.jamie.bean.UserService;
import com.jamie.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = context.getBean("userService", UserService.class);
		userService.getUserService();
	}
}
