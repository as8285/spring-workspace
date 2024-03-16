package com.kh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.paging.model.vo.Film;
import com.kh.paging.model.vo.Paging;
import com.kh.service.FilmService;


@Controller
public class filmController {
	@Autowired
	private FilmService service;
	
	@GetMapping("/list")
	public void showFilm(Model model,Paging paging) {
		
		System.out.println(paging);
		
		List<Film>list = service.showFilm(paging);
		model.addAttribute("list",list);
		// 페이징 처리 해야한다.
		model.addAttribute("paging",new Paging(paging.getPage(),service.total()));
		
		
	}
}