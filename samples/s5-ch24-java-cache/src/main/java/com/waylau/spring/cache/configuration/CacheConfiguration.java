package com.waylau.spring.cache.configuration;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Cache Configuration.
 * 
 * @since 1.0.0 2018年4月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@EnableCaching
@Configuration
public class CacheConfiguration {

    @Bean
	public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("weahterDataByCityId"),
        		new ConcurrentMapCache("weahterDataByCityName")));
        return cacheManager;
	}
}
