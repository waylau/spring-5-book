/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Fighter.
 * 
 * @since 1.0.0 2018年2月1日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Aspect
public class Fighter {

	@Pointcut("execution(* com.waylau.spring.aop.Tiger.walk())")
	public void foundTiger() {
	}

	@Before(value = "foundTiger()")
	public void foundBefore() {
		System.out.println("Fighter wait for tiger...");
	}

	@AfterReturning("foundTiger()")
	public void foundAfter() {
		System.out.println("Fighter fight with tiger...");
	}

}
