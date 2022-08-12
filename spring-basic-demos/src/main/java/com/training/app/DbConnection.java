package com.training.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class DbConnection {
	
	private String url;
	private String username;
	private String password;
	private String dailet;
	
	
	public String getUrl() {
		return url;
	}
	@Value("${connection.url}")
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUsername() {
		return username;
	}
	@Value("${connection.username}")
	public void setUsername(String username) {
		this.username = username;
	}
		
	public String getPassword() {
		return password;
	}
	@Value("${connection.password}")
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDailect() {
		return dailet;
	}
	@Value("${connection.dailet}")
	public void setDailect(String dailect) {
		this.dailet = dailect;
	}
	
	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", username=" + username + ", password=" + password + ", dailect=" + dailet
				+ "]";
	}
	
	
	
	

}
