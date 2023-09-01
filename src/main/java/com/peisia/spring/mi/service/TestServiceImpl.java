package com.peisia.spring.mi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peisia.spring.mi.dto.TestDto;
import com.peisia.spring.mi.mapper.TestMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
//@AllArgsConstructor
public class TestServiceImpl implements TestService{

	@Setter(onMethod_ = @Autowired)
	private TestMapper mapper;	
	
	@Override
	public String getOne() {
		log.info("test===========");
		TestDto dto = mapper.getData1();
		String one = dto.getStr_data();
		return one;
	}

	@Override
	public String getTwo() {
		log.info("test===========");
		TestDto dto = mapper.getData2();
		String two = dto.getStr_data();
		return two;
	}
	

	/* 문제 1 */
	@Override
	public void updateVisitantCount() {
		mapper.updateVisitantCount();
	}	
	
	@Override
	public void insertDoodle() {
		mapper.insertDoodle();
	}	
	
	@Override
	public void delTest() {
		mapper.delTest();
	}	

}
