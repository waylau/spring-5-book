/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jdbc.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import com.waylau.spring.jdbc.vo.User;

/**
 * User SqlUpdate.
 * 
 * @since 1.0.0 2018年3月5日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class UserSqlUpdate extends SqlUpdate {
	
	public UserSqlUpdate(DataSource ds) {
        setDataSource(ds);
        setSql("INSERT INTO USER (username, age) VALUES (?, ?)");
        declareParameter(new SqlParameter("username", Types.VARCHAR));
        declareParameter(new SqlParameter("age", Types.NUMERIC));
        compile();
    }
	
	 public int execute(User user) {
	    return update( user.getUsername(), user.getAge());
	}

}
