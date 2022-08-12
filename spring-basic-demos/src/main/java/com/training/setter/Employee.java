package com.training.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Employee {
	private String name;
	private double salary;
    private Integer employeeId;
    
    
    private Address address; //inject address into employee
    
    
	public Address getAddress() {
		return address;
	}
	@Autowired
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	@Value("${employee.salary}")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	@Value("${employee.employeeId}")
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", employeeId=" + employeeId + ", address=" + address
				+ "]";
	}
    
	
	
    

}
