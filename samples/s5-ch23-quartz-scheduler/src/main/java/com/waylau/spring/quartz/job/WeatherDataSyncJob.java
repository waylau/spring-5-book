/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.waylau.spring.quartz.service.WeatherDataService;

/**
 * 天气数据同步任务.
 * 
 * @since 1.0.0 2018年4月18日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class WeatherDataSyncJob extends QuartzJobBean {
	
	private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class); 
	
	@Autowired
	private WeatherDataService weatherDataService;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("Start 天气数据同步任务");
		
 		String cityId = "101280301"; // 惠州

 		logger.info("天气数据同步任务中，cityId:" + cityId);
		
		// 根据城市ID获取天气
 		logger.info(weatherDataService.getDataByCityId(cityId).getData().toString());
 		
	}

}
