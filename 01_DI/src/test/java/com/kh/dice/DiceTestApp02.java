package com.kh.dice;

import com.kh.dice.impl.DiceBImpl;
import com.kh.dice.impl.Player03;
import com.kh.dice.play.Player01;
import com.kh.dice.play.Player02;
// Spring 안쓰고 재사용하는 방법 : 인터페이스
public class DiceTestApp02 {

	public static void main(String[] args) {
		Player03 player01 = new Player03();
		player01.playDice(12);
		System.out.println("=======");
		System.out.println("선택된 주사위수 총합 : " + player01.getTotalValue());
		System.out.println("=======");
		
		Player03 player02 = new Player03(new DiceBImpl());
		player02.playDice(5);
		System.out.println("=======");
		System.out.println("선택된 주사위수 총합 : " + player02.getTotalValue());
		System.out.println("=======");

	}

}
