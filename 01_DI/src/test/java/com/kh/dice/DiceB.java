package com.kh.dice;

import java.util.Random;

public class DiceB {
	private int value;
	public DiceB() {
		System.out.println(getClass().getName()+"������...");
	}

	// �ֻ����� ���� ���õǴ� ���ڸ� ����
public void selectedNumber() {
value = new Random().nextInt(6) + 1;	
}
}
