package com.training.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Address {
	
	private String city;
	private String state;
	
	
	public String getCity() {
		return city;
	}
	@Value("${address.city}")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	
	@Value("${address.city}")
	public void setState(String state) {
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	

}
