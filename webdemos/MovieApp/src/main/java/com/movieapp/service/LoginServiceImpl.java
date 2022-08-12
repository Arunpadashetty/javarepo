package com.movieapp.service;

import java.util.stream.Stream;

public class LoginServiceImpl implements ILoginService {
	String[] usernames= {"Jhon", "Jhony","jhanardhan"};

	@Override
	public boolean validateUsername(String username,String password) {
	
//		for(String name:usernames) {
//			if(name.equals(username)) {
//		
//		return true;
//		}}
//		return false;
		
//			
		return Stream.of(usernames)  //convert array into stream
		.filter(str->str.equals(username) && password.equals("admin123"))  //filter
		.findAny()  //find one value
		.isPresent();//return true if present
	}
}
