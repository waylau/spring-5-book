/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;

import com.waylau.spring.jdbc.vo.User;

/**
 * User MappingQuery.
 * 
 * @since 1.0.0 2018年3月5日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class UserMappingQuery extends MappingSqlQuery<User> {

	public UserMappingQuery(DataSource dataSource) {
        super(dataSource, "SELECT username, age FROM USER");
        compile();
	}

	@Override
	protected User mapRow(ResultSet rs, int rowNumber) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setAge(rs.getInt("age"));
		return user;
	}

}
