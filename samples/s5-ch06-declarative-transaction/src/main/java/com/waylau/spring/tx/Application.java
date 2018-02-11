/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.waylau.spring.tx.service.UserService;
import com.waylau.spring.tx.vo.User;

/**
 * Application Main.
 * 
 * @since 1.0.0 2018年1月28日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		UserService UserService = context.getBean(UserService.class);
		UserService.saveUser(new User("Way Lau", 30));
	}

}
