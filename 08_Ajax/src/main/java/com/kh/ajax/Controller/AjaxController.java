package com.kh.ajax.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	private int count = 0;
	@ResponseBody
	@GetMapping("/count")
	public int count() {
		System.out.println("ajax로 요청이 들어옴");
		return ++count;

	}
	
	@ResponseBody
	@GetMapping("/encoding")
	public String encoding(String nick) {
		return nick;
	}
}                                    
