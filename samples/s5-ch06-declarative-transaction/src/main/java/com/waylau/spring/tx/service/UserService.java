/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.tx.service;

import com.waylau.spring.tx.vo.User;

/**
 * User Service.
 * 
 * @since 1.0.0 2018年2月10日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface UserService {

	void saveUser(User user);
}
