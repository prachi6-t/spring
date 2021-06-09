package com.accenture.lkm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UITester {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/accenture/lkm/resources/my_springbean.xml");
		Employee employee = (Employee) applicationContext.getBean("empObject");
		
		System.out.println("==========================================");
		System.out.println("List: "+employee.getListProperty());
		System.out.println("Set: "+employee.getSetProperty());
		System.out.println("Map: "+employee.getMapProperty());
		System.out.println("Property: "+employee.getPropertiesProperty());
		System.out.println("==========================================");
	}

}
// but how to finally get rid f object creation ??
