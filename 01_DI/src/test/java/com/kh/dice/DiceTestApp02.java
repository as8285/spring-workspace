package com.kh.dice;

import com.kh.dice.impl.DiceBImpl;
import com.kh.dice.impl.Player03;
import com.kh.dice.play.Player01;
import com.kh.dice.play.Player02;
// Spring �Ⱦ��� �����ϴ� ��� : �������̽�
public class DiceTestApp02 {

	public static void main(String[] args) {
		Player03 player01 = new Player03();
		player01.playDice(12);
		System.out.println("=======");
		System.out.println("���õ� �ֻ����� ���� : " + player01.getTotalValue());
		System.out.println("=======");
		
		Player03 player02 = new Player03(new DiceBImpl());
		player02.playDice(5);
		System.out.println("=======");
		System.out.println("���õ� �ֻ����� ���� : " + player02.getTotalValue());
		System.out.println("=======");

	}

}
