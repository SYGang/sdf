package com.peisia.spring.mi.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.peisia.spring.mi.mapper.GuestMapper;
import com.peisia.spring.mi.vo.GuestVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class GuestServiceImpl implements GuestService{
	@Setter(onMethod_ = @Autowired)
	private GuestMapper mapper;

	@Override
	public Model getList(Model m, int currentPage) {
//		int PerPage = 5;	
//	public HashMap<String, Object> getList(int currentPage){
//		HashMap<String, Object> hm = new HashMap<>();
		int listCountPerPage = 5;
		int pagesPerBlock = 3;
		int currentBlock = 1;
		int blockStartPage = 1 ;
		int blockEndPage = 1;
		int blockCount = 1;
		int prevPage = 1;
		int nextPage = 1;
		
	int limitIndex = (currentPage-1) * listCountPerPage;
//	hm.put("list", mapper.getList(limitIndex));
	m.addAttribute("list", mapper.getList(limitIndex));
	int count = mapper.getCount();
//	hm.put("count", mapper.getCount());
	m.addAttribute("count",mapper.getCount());
	
//	m.addAttribute("list", mapper.getList(limitIndex));
//	m.addAttribute("count", mapper.getCount());
	
	int totalPageCount = 0;
	
	totalPageCount = (int) Math.ceil((double)count / listCountPerPage);
	log.info("========== 게시글 수 :"+count);
	log.info("========== 페이지 수 :"+totalPageCount);
	
//	hm.put("totalPageCount",totalPageCount);
	m.addAttribute("totalPageCount",totalPageCount);
	
	m.addAttribute("pagesPerBlock",pagesPerBlock);

	blockCount = (int)Math.ceil((double)totalPageCount/pagesPerBlock);
	m.addAttribute("blockCount",blockCount);
	
	
	currentBlock = (int)Math.ceil((double)totalPageCount/pagesPerBlock);
	m.addAttribute("currentBlock",currentBlock);
	
	blockStartPage = (currentBlock-1) * pagesPerBlock + 1;
	
	blockEndPage = currentBlock * pagesPerBlock;
	if(blockEndPage > totalPageCount) {
		blockEndPage = totalPageCount;
	}
	m.addAttribute("blockStartPage", blockStartPage);
	m.addAttribute("blockEndPage", blockEndPage);
	
	return m;
	}
	
	
	@Override
	public GuestVO read(long bno) {
		return mapper.read(bno);
	}
	@Override
	public void del(long bno) {
		mapper.del(bno);
	}
	@Override
	public void write(GuestVO gvo) {
		mapper.write(gvo);
	}
	@Override
	public void modify(GuestVO gvo) {
		mapper.modify(gvo);
	}



	



	
}