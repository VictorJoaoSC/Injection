package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Container {
	
	ApplicationContext appContainer ;
	
	public ApplicationContext getContext() {
		if(appContainer == null) {
			this.appContainer = new ClassPathXmlApplicationContext("container.xml");
			return appContainer;
		}
		return appContainer;
	}

}
