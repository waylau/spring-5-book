package com.waylau.spring.el;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Shop List.
 * 
 * @since 1.0.0 2018年2月4日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class ShopList {
	private String name;
	private int count;
	private double price;

	private List<Item> items = new ArrayList<Item>();

	private Item onlyOne;

	private String[] allGood;

	public String[] getAllGood() {
		return allGood;
	}

	public void setAllGood(String[] allGood) {
		this.allGood = allGood;
	}

	public Item getOnlyOne() {
		return onlyOne;
	}

	public void setOnlyOne(Item onlyOne) {
		this.onlyOne = onlyOne;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShopList [name=" + name + ", count=" + count + ", price=" 
				+ price + ", items=" + items + ", onlyOne="
				+ onlyOne + ", allGood=" + Arrays.toString(allGood) + "]";
	}
}
