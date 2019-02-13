/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.scope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * Thread Scope.
 * 
 * @since 1.0.0 2019年2月13日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class ThreadScope implements Scope {
	
	private final ThreadLocal<Map<String, Object>> threadLoacal = new ThreadLocal<Map<String, Object>>() {
		@Override
		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>();
		}
	};

	public Object get(String name, ObjectFactory<?> objectFactory) {
		Map<String, Object> scope = threadLoacal.get();
		Object obj = scope.get(name);

		// 不存在则放入ThreadLocal
		if (obj == null) {
			obj = objectFactory.getObject();
			scope.put(name, obj);
			
			System.out.println("Not exists " + name + "; hashCode: " + obj.hashCode());
		} else {
			System.out.println("Exists " + name + "; hashCode: " + obj.hashCode());
		}

		return obj;
	}

	public Object remove(String name) {
		Map<String, Object> scope = threadLoacal.get();
		return scope.remove(name);
	}

	public String getConversationId() {
		return null;
	}

	public void registerDestructionCallback(String arg0, Runnable arg1) {
	}

	public Object resolveContextualObject(String arg0) {
		return null;
	}

}
