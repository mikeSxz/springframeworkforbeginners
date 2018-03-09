package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Calculator calc = (Calculator)applicationContext.getBean("calc");
		
		System.out.println(calc.add());
		System.out.println(calc.divide());
		System.out.println(calc.multiply());
		System.out.println(calc.substract());
		
		
		
	}

}
