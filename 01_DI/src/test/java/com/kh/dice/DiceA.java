package com.kh.dice;

import java.util.Random;

import lombok.Getter;
@Getter
public class DiceA {

		private int value;
		public DiceA() {
			
			System.out.println(getClass().getName()+"������...");
		
	}

	// �ֻ����� ���� ���õǴ� ���ڸ� ����
public void selectedNumber() {
value = new Random().nextInt(6) + 1;
}
}