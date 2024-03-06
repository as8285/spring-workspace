package com.kh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.paging.model.vo.Film;
import com.kh.paging.model.vo.Paging;
import com.kh.pagingDAO.FilmDAO;

@Service
public class FilmService {
	@Autowired
	private FilmDAO dao;
	
	public List<Film>showFilm(Paging paging){
		
		
		/* 만약에 limit 가 10 인경우
		 * page=2 - > offset =10
		 * page=3 -> offset = 20
		 * 
		 * 만약 limit 5 인경우 
		 * page = 2-> offset = 5
		 * page = 3 -> offset= 10
		 * page = 4 -> offset= 15
		 * offset = limit * (page - 1)
		 * */
		paging.setOffset(paging.getLimit() * (paging.getPage()-1));
		return dao.showFilm(paging);
	}
	public int total() {
		
		return dao.total();
	}
}

