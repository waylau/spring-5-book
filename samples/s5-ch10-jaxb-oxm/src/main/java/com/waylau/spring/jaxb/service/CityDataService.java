package com.waylau.spring.jaxb.service;

import java.util.List;

import com.waylau.spring.jaxb.vo.City;


/**
 * City Data Service.
 * 
 * @since 1.0.0 2018年3月9日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface CityDataService {

	/**
	 * 获取City列表
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
