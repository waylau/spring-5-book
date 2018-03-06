/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.waylau.spring.jdbc.vo.User;

/**
 * User DAO.
 * 
 * @since 1.0.0 2018年3月6日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Repository
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	public List<User> listUser() {
		List<User> users = this.jdbcTemplate.query(
		        "SELECT username, age FROM USER",
		        new RowMapper<User>() {
		            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	User user = new User();
		                user.setUsername(rs.getString("username"));
		                user.setAge(rs.getInt("age"));
		                return user;
		            }
		        });
		
		return users;
	}

}
