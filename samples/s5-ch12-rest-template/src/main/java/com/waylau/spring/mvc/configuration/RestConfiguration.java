package com.waylau.spring.mvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
    	RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
