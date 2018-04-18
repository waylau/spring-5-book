package com.waylau.spring.quartz.configuration;

import java.nio.charset.StandardCharsets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * REST配置.
 * 
 * @since 1.0.0 2018年3月22日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Configuration
public class RestConfiguration {

    @Bean  
    public RestTemplate restTemplate() { 
    	RestTemplate restTemplate = new RestTemplate(
    			new HttpComponentsClientHttpRequestFactory()); // 使用HttpClient，支持GZIP
    	restTemplate.getMessageConverters().set(1, 
    			new StringHttpMessageConverter(StandardCharsets.UTF_8)); // 支持中文编码
        return restTemplate;
    }

}
