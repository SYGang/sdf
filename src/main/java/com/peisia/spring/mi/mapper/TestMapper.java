package com.peisia.spring.mi.mapper;

import com.peisia.spring.mi.dto.TestDto;

public interface TestMapper {
	public TestDto getData1();
	public TestDto getData2();
	public TestDto getData3();
	public TestDto getData4();
	
	public void updateVisitantCount();
	
	public void insertDoodle();
	
	public void delTest();	
}
