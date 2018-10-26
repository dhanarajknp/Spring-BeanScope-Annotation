package com.javasampleapproach.scopeannotation.SpringBeanScopeAnnotation.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class Age {
	private String age = "24";
 
	public Age() {
		System.out.println("Create new Age: " + this.age);
	}
 
	public String getAge() {
		return age;
	}
 
	public void setAge(String age) {
		this.age = age;
	}
}