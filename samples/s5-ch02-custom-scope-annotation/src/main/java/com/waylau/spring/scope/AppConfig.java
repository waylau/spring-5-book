/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.scope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @since 1.0.0 2019年2月13日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public static CustomScopeConfigurer customScopeConfigurer() {
		CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("threadScope", new ThreadScope());

		// 配置scope
		customScopeConfigurer.setScopes(map);
		return customScopeConfigurer;
	}
}
