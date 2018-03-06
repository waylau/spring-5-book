/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.jdbc.dao.UserDao;
import com.waylau.spring.jdbc.vo.User;

/**
 * User Service.
 * 
 * @since 1.0.0 2018年2月10日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class UserServiceImpl implements UserService {

	private UserDao userdao;
	
    @Autowired
    public void setUserDao(UserDao userdao) {
        this.userdao = userdao;
    }

	public List<User> listUser() {
		return userdao.listUser();
	}

}
