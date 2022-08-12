package com.training.constr;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.setter.Employee;

public class StudentMain {

	public static void main(String[] args) {
		
ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
		
		//get the bean from the IOC Container
		Student student= (Student) context.getBean("student");   //employee object is given		
		System.out.println(student);
	
	}

}
