package com.training.setter;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
		
		//get the bean from the IOC Container
		Employee emp= (Employee) context.getBean("employee");   //employee object is given		
		System.out.println(emp);
//		Employee emp1=context.getBean(Employee.class,"employee");
//		System.out.println(emp1);
//		Employee emp2=context.getBean(Employee.class);
//		System.out.println(emp2);
		
		//beans created by the IOC container
//		String[] beans=context.getBeanDefinitionNames();
//		for(String bean:beans) {
//			System.out.println(bean);
//		}
//		System.out.println("Another Way");
//		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
