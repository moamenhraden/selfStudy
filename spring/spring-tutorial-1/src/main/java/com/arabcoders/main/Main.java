package com.arabcoders.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shape rect1 = context.getBean("Rectangle", Shape.class);
		Shape rect2 = context.getBean("Rectangle", Shape.class);
		log("singleton gives the same object : ", rect1.hashCode(), rect2.hashCode());

		Shape circle1 = context.getBean("Circle", Shape.class);
		Shape circle2 = context.getBean("Circle", Shape.class);
		log("prototype gives different objects : ", circle1.hashCode(), circle2.hashCode());

		context.close();
	}

	static void log(Object... list) {
		for (Object el : list) {
			System.out.println(el);
		}
	}

}