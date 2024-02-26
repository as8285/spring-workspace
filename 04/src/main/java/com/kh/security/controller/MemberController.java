package com.kh.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.security.model.vo.Member;
import com.kh.security.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	// 회원가입 페이지 이동
@GetMapping("/register")
public void  register() {}
//회원가입 로직
@PostMapping("/register")
public String register(Member vo) {
	service.registerMember(vo);
	return "redirect:/login";
	
	
}
}