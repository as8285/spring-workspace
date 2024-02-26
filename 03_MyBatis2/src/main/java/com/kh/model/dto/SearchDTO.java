package com.kh.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SearchDTO {
	private String keyword;
	private String select;
	
	
	
	public SearchDTO() {
		
	}



	public SearchDTO(String keyword, String select) {
		this.keyword = keyword;
		this.select = select;
	}



	public String getKeyword() {
		return keyword;
	}



	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}



	public String getSelect() {
		return select;
	}



	public void setSelect(String select) {
		this.select = select;
	}



	@Override
	public String toString() {
		return "SearchDTO [keyword=" + keyword + ", select=" + select + "]";
	}
}