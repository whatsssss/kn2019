package org.zerock.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
@AllArgsConstructor
public class BoardControlelr {

	private BoardService service;

	// why is not boardService imp 이 아닌 보드 서비스 타입일까요? -> (타입만받게..) setter,
	//

	@GetMapping("/list")
	public void listAll(Model model) {
		model.addAttribute("list", service.listAll());
	}
	
	

	@GetMapping("/register")
	public void register() {
		log.info("get register.............");
	}

	@PostMapping("/register")
	public String register(BoardVO vo, RedirectAttributes rttr) {
		log.info("post register.................");
		log.info("vo: " + vo);
		service.register(vo);
		rttr.addFlashAttribute("result", "SUCCESS");
		return "redirect:/board/list";

	}

}
