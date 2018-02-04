/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Main.
 * 
 * @since 1.0.0 2018年2月4日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		ShopList list = (ShopList) ctx.getBean("list");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list2");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list3");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list4");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list5");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list6");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list7");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list8");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list9");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list10");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list11");
		System.out.println(list);

		list = (ShopList) ctx.getBean("list12");
		System.out.println(list);
	}

}
