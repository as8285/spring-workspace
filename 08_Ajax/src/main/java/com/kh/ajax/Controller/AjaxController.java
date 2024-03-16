package com.kh.ajax.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.ajax.Service.MemberService;
import com.kh.ajax.model.vo.Member;

@Controller
public class AjaxController {
	private int count = 0;
	
	@Autowired
	private MemberService service;
	
	
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
	
	@ResponseBody
	@PostMapping("/check")
		public boolean check(String id) {
		Member member = service.idCheck(id);
		if(member==null)return false;
			return true;
		}
	
	@ResponseBody
	@PostMapping("/serial")
		public Member serial(Member member) {
		System.out.println(member);
		service.register(member);
		return member;
	}
		}

	
                                   
