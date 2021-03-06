package com.springApp5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext apx = new ClassPathXmlApplicationContext("applicationContext.xml");

		PresentationBean pb = apx.getBean(PresentationBean.class, "pb");
		pb.present();
	}
}
