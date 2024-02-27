package com.semi.coupang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
//header.jsp에서 이동
	@GetMapping("/register")
	public void register() {}
}
