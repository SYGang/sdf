package com.peisia.spring.mi.service;

import lombok.Data;
import lombok.extern.log4j.Log4j;
@Data
@Log4j
public class Cat {
	
	private Dog duri;
	public Cat() {
		
	}
	
	public Cat(Dog d) {
		duri=d;
	}

	private String name;
		// TODO Auto-generated method stub
		
	

	private Integer age;
		// TODO Auto-generated method stub
		
	
	

}
