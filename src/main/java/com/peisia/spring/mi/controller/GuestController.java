package com.peisia.spring.mi.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.peisia.spring.mi.service.GuestService;
import com.peisia.spring.mi.vo.GuestVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/guest/*")
//프로젝트 루트경로이하/guest 상위폴더로 진입시 여기로 진입하게됨
@AllArgsConstructor
//필드 값을 매개변수로 하는 생성자를 스프링에서 자동생성해줌 그런형태의 생성자를 추가하면 객체관리까지 해줌
@Controller
public class GuestController {
//@AllArgsConstructor로 자동삽입된 코드
	//	public GuestController(GuestService service){
//	this.service = service;
//}(
	private GuestService service;
	
	@GetMapping("/getList")
	public void getList(@RequestParam(value="currentPage",defaultValue="1")int currentPage, Model model) {
//		HashMap<String, Object> hm = service.getList(currentPage);
//		model.addAttribute("count",hm.get("count"));
//		model.addAttribute("list",hm.get("list"));
//		model.addAttribute("totalPageCount",hm.get("totalPageCount"));
		model = service.getList(model, currentPage);
		
	}
	
	@GetMapping({"/read","/modify"})
	public void read(@RequestParam("bno")Long bno, Model model) {
		log.info("컨트롤러 ====== 글번호  =========="+bno);
		model.addAttribute("read",service.read(bno));
	}
	
	@GetMapping("/del")
	public String del(@RequestParam("bno")Long bno) {
		log.info("컨트롤러 ====== 글번호  =========="+bno);
		service.del(bno);
		return "redirect:/guest/getList";
	}
	@PostMapping("/write")
	public String write(GuestVO gvo) {
		service.write(gvo);
		return "redirect:/guest/getList";
	}
	
	@GetMapping("/write")
	public void write() {
	}
	

	
	@PostMapping("/modify")
	public String modify(GuestVO gvo) {
		service.modify(gvo);
		return "redirect:/guest/getList";
	}
	
	@RequestMapping("/test")
	public void test(HttpServletRequest request,Model m) {
		setCp(m,request.getContextPath());
		m.addAttribute("a","개");
		m.addAttribute("b","삵");
	}
	
	public void setCp(Model m, String cp) {
		m.addAttribute("cp",cp);
		log.info("==== 컨텍스트 패스임:"+cp);
	}
	
	@RequestMapping("/test2")
	public void test2() {
		
	}
	
	@RequestMapping("/testapi")
	public void testapi() {
		
	}
}
