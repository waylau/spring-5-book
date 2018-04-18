/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.quartz.configuration;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

/**
 * Quartz Job Factory.
 * 用于解决无法在 QuartzJobBean注入bean的问题
 * 
 * @since 1.0.0 2018年4月19日
 * @author <a href="https://waylau.com">Way Lau</a> 
 * @see QuartzJobBean
 * @see WeatherDataSyncJob
 */
public class QuartzJobFactory extends SpringBeanJobFactory {
	
	@Autowired
    private AutowireCapableBeanFactory beanFactory;

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object jobInstance = super.createJobInstance(bundle);
        beanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}
