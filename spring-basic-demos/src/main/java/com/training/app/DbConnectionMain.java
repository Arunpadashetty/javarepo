package com.training.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.constr.Student;

public class DbConnectionMain {

	public static void main(String[] args) {
		
		
        ApplicationContext context=new AnnotationConfigApplicationContext("com.training.app");
		
		//get the bean from the IOC Container
		DbConnection dbconnection= context.getBean(DbConnection .class,"dbConnection");   //employee object is given		
		System.out.println(dbconnection);
	

	}

}
