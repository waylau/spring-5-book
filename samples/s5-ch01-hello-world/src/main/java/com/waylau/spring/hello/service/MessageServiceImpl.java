/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.hello.service;

import org.springframework.stereotype.Service;

/**
 * Message Service Impl.
 * 
 * @since 1.0.0 2018年1月25日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Service
public class MessageServiceImpl implements MessageService {
	
	public String getMessage() {
		return "Hello World!";
	}

}
