package com.kh.dice;

import java.util.Random;

import lombok.Getter;
@Getter
public class DiceA {

		private int value;
		public DiceA() {
			
			System.out.println(getClass().getName()+"생성자...");
		
	}

	// 주사위를 던져 선택되는 숫자를 생산
public void selectedNumber() {
value = new Random().nextInt(6) + 1;
}
}