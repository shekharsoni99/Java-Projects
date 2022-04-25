package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Circle c = apx.getBean(Circle.class, "circle");

		double x = c.areaOfCircle();
		System.out.println(x);
	}

}
