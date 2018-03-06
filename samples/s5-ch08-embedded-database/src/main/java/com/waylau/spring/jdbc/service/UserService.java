/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jdbc.service;

import java.util.List;

import com.waylau.spring.jdbc.vo.User;

/**
 * User Service.
 * 
 * @since 1.0.0 2018年2月26日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface UserService {

	/**
	 * 查询用户
	 * 
	 * @return
	 */
	List<User> listUser();
}
