package org.zerock.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j

public class SampleController {

	@GetMapping("/ex1")
	public void doA(SampleDTO dto) {
		log.info(dto);
	}

	@GetMapping("/ex2")
	public void ex2(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info(name);
		log.info(age);
	}

	@GetMapping("/ex2arr")

	public void ex2arr(@RequestParam("ids") String[] ids) {
		log.info(Arrays.deepToString(ids));

	}

	// @GetMapping("/ex02Bean")
	@RequestMapping(value = "/ex2Bean", method = { RequestMethod.GET, RequestMethod.POST })
	public void ex2Bean(SampleDTOList list) {
		System.out.println("------------------------------------------");
		log.info(list);

	}

//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(df, false));
//
//	}
	@GetMapping("/ex3")
	public void ex3(TodoDTO todo) {
		log.info(todo);

	}
	
	@GetMapping("/ex3A")
	public void ex3A(TodoDTO todo) {
		log.info(todo);
	}
	

/*-----------------------------------------------------return 반환-----------*/
	@GetMapping("/ex4")
	public String ex4(TodoDTO dto, int page) {
		log.info("ex4..............");
		log.info(dto);
		log.info(page);
		return "/sample/ex4";
	}
	
	@GetMapping("/ex4A")
	public String ex4A(TodoDTO dto, @ModelAttribute("page") int page) {
		log.info("ex4..............");
		log.info(dto);
		log.info(page);
		return "/sample/ex4";
	}
	
	@GetMapping("/ex4B")
	
	//화면에 결과처리 할때 .. 뭔가를 전달하고 싶어 ? Model을 써.
	public String ex4A(TodoDTO dto, @ModelAttribute("page") int page, Model model) {
		log.info("ex4..............");
		log.info(dto);
		log.info(page);
		model.addAttribute("result", "SUCCESS");
		return "/sample/ex4";
	}
	
	@GetMapping("/ex5")
	public String ex5() {
		log.info("ex5........");
		return "redirect:/sample/ex6?result=SUCCESS";
	}
	@GetMapping("/ex5A")
	public String ex5(RedirectAttributes rttr) {
		log.info("ex5........");
		rttr.addFlashAttribute("result", "SUCCESS"); //한번만 전달되는 파라미터 
		return "redirect:/sample/ex6";
	}
	//redirect 모델 없어짐.
	
	@GetMapping("/ex6")
	public void ex6() {
		log.info("ex6........");
	}
	

}
