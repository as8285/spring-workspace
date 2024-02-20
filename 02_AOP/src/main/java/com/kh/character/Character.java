package com.kh.character;

import com.kh.aop.weapon.Weapon;

public class Character {
	
	private String name;
	private int level;
	private Weapon weapon;
	
	public String quest(String questName) {
		return questName + "퀘스트 진행중";
	}
}
