/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.waylau.spring.jdbc.service.UserService;
import com.waylau.spring.jdbc.vo.User;

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
		
		UserService.createUserTable();
		
		UserService.saveUser(new User("Way Lau", 30));
		UserService.saveUser(new User("Rod Johnson", 45));
		
		List<User> users = UserService.listUser();
		
		for (User user : users) {
			System.out.println(user);
		}
	}

}
