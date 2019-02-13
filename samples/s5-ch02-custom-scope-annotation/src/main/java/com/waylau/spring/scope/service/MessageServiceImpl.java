/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.scope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Message Service Impl.
 * 
 * @since 1.0.0 2019年2月13日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Scope("threadScope")
@Service
public class MessageServiceImpl implements MessageService {
	
	public String getMessage() {
		return "Hello World!";
	}

}
