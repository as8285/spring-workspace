package com.semi.coupang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController2 {
@GetMapping("detail")
public String detail() {
	return "detail";
}
}
