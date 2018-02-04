package com.waylau.spring.el;

/**
 * Item.
 * 
 * @since 1.0.0 2018年2月4日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Item {
	private String good;
	private double weight;

	public String getGood() {
		return good;
	}

	public void setGood(String good) {
		this.good = good;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Item [good=" + good + ", weight=" + weight + "]";
	}
}
