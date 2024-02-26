package com.kh.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	// register -> register.jsp (회원정보 : 아이디, 비밀번호, 이름)	
	// ->redirect : 첫 페이지로 이동 return "redirect:/	
	@GetMapping("register")
	public String register() {
		return "register";		
	}
	// @PostMapping : signUp (Member 또는 개별적으로 매겨변수로)		 
	@PostMapping("signUp")
	public String signUp(Member vo) {
		System.out.println(vo);
		service.registerMember(vo);
		return"redirect:/";
		
	}
		//-> session 바인딩 : 멤버 정보 저장을 위해 매개변수로 HttpservletRequest
		// ->login_result.jsp (회원 정보 보일 수 있도록)
	
	// login -> login.jsp(아이디, 비밀번호)
	@GetMapping("login")
	public String login() {
		return "login";
	}
	// @PostMapping : signIn (Member 매개변수로)

	@PostMapping("signIn")
	public String signin(Member vo,HttpServletRequest request) {
		// -> session 바인딩 : 멤버 정보 저장을 위해 매개변수로 HttpservletRequest
		HttpSession session = request.getSession();
		session.setAttribute("vo", service.login(vo));
	// ->login_result.jsp (회원 정보 보일 수 있도록)
		return "login_result";

	}
	// logout : session 죽이기! : 매개변수로 HttpServletRequest
	// -> redirect : 첫 페이지로 이동!
@GetMapping("logout")
public String logout(HttpServletRequest request) {
	HttpSession session = request.getSession();
	session.invalidate();
	return "redirect:/";
}

// update -> update.jsp(회원 정보가 보여진 상태 : 아이디, 비밀번호, 이름)
// @PostMapping : updateMember (Member
// -> redirect : 첫 페이지로 이동!

@GetMapping("update")
public String update() {
	return "update";
	
}

@PostMapping("updateMember")
	public String updateMember(Member vo,HttpServletRequest request) {
		HttpSession session =request.getSession();
		if(service.updateMember(vo)==1) {
			session.setAttribute("vo",vo);
		
		}
		return "redirect:/";
			
}
//search -> search.jsp (키워드 정보 하나만!)
	@GetMapping("search")
	public String seach() {
		return "search";
		
	}

		@GetMapping("find")
		public String find(String keyword,String select,Model model) {
			
		List<Member> list =service.findMember(keyword,select);
		model.addAttribute("list",list);
			
			return "find_result";
			
		}
	@GetMapping("find2")
public String find2(String[] checkId,Model model) {
		System.out.println(Arrays.toString(checkId));
		List<Member> list = service.findMember2(checkId);
		model.addAttribute("list",list);
	return "find_result";
}
		
}	// search -> search.jsp (키워드 정보 하나만!)
		// @GetMapping : find (String keyword 매개변수로)
		// -> find_result.jsp (검색된 정보 보일 수 있도록 여러명 가능)


