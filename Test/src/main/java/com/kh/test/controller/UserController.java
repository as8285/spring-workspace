package com.kh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import com.kh.test.model.vo.User;
import com.kh.test.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/selectUser")
	public String selectUser(String userNo, Model model) {

		int no = Integer.parseInt(userNo);

		User user = service.selectUser(no);

		if (user != null) {

			model.addAttribute("user", user);
			return "searchSuccess";
		}
		return "searchFail";

	}
}