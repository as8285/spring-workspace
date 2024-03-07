package com.kh.ajax.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// page 이동을 조작하는 controller

@Controller
public class PageController {
	@GetMapping("/ajax01")
	public String ajax01() {
		return "01_count";
	}
	
	@GetMapping("/ajax02")
	public String ajax02() {
		return "02_encoding";
	}
	
	@GetMapping("/ajax03")
	public String ajax03() {
		return "03_register";
	}
	@GetMapping("/ajax04")
	public String ajax04() {
		return "04_serialize";
	}
}