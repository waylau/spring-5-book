/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jaxb;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.waylau.spring.jaxb.service.CityDataService;
import com.waylau.spring.jaxb.vo.City;

/**
 * Application Main.
 * 
 * @since 1.0.0 2018年3月9日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Application {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		CityDataService cityDataService = context.getBean(CityDataService.class);
		
		List<City> cityList = cityDataService.listCity();
		for (City city : cityList) {
			System.out.println(city);
		}

	}

}
