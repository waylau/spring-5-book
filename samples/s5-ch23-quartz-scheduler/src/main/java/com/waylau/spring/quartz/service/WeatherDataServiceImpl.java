package com.waylau.spring.quartz.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waylau.spring.quartz.vo.WeatherResponse;

/**
 * 天气数据服务.
 * 
 * @since 1.0.0 2018年3月22日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

	@Autowired
	private RestTemplate restTemplate;

	private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

	@Override
	public WeatherResponse getDataByCityId(String cityId) {
		String uri = WEATHER_API + "?citykey=" + cityId;
		return this.doGetWeatherData(uri);
	}

	@Override
	public WeatherResponse getDataByCityName(String cityName) {
		String uri = WEATHER_API + "?city=" + cityName;
		return this.doGetWeatherData(uri);
	}

	private WeatherResponse doGetWeatherData(String uri) {

	    ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
	    
	    String strBody = null;

	    if (response.getStatusCodeValue() == 200) {
	        strBody = response.getBody();
	    }

	    ObjectMapper mapper = new ObjectMapper();
	    WeatherResponse weather = null;

	    try {
	        weather = mapper.readValue(strBody, WeatherResponse.class);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    return weather;
	}
	

}
