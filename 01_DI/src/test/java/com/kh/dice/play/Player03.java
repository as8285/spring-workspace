package com.kh.dice.play;

import com.kh.dice.Dice;
import com.kh.dice.DiceA;

import lombok.Data;
import lombok.Getter;
@Data
public class Player03 {
	private Dice dice;
	private int totalValue;
	//count��ŭ �ֻ��� ������ �ֻ��� ���� ���ϴ� ���� 
	public void playDice(int count) {
		
		System.out.println("==>" + getClass().getName()+".playDice()start...");
	for(int i=0;i<count;i++) {
		diceB.selectedNumber();
		System.out.println("[" + diceB.getClass().getName()+"]�� ���õ� �� : " + diceB.getValue());

		totalValue += diceB.getValue();
		System.out.println("==>" + getClass().getName()+".playDice()end...");
	}
	}
	}


