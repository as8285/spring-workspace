package com.kh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.model.vo.Member;
import com.kh.service.MemberService;

@Controller
public class MemberController {
		
	@Autowired
	private MemberService service;
	
	@GetMapping("allMember")
	public String allMember(Model model) {
		List<Member>list = service.showAllMember();
		for(Member m : list) {
			System.out.println();
		}
		model.addAttribute("list",list);
		return "allMember";
	}
	
	
	
}
