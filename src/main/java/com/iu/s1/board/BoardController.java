package com.iu.s1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board/**")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("boardList")
	public ModelAndView boardList() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<BoardVO> list = boardService.boardList();
		if(list.isEmpty()) {
			System.out.println("비어잇음");
		}
		System.out.println("test : " + list.size());
		return mv;
	}
}
