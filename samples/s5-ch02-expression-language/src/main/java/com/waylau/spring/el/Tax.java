package com.waylau.spring.el;

/**
 * Tax.
 * 
 * @since 1.0.0 2018年2月4日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Tax {
	private double ctax;
	private String name;

	public static String getCountry() {
		return "zh_CN";
	}

	public String getName() {
		return this.name;
	}

	public double getCtax() {
		return ctax;
	}

	public void setCtax(double ctax) {
		this.ctax = ctax;
	}
}
