package com.kh.dice.play;

import com.kh.dice.DiceA;

import lombok.Getter;
@Getter
public class Player02 {
	private DiceA diceB = new DiceA();
	private int totalValue;
	//count만큼 주사위 굴려서 주사위 합을 구하는 로직 
	public void playDice(int count) {
		
		System.out.println("==>" + getClass().getName()+".playDice()start...");
	for(int i=0;i<count;i++) {
		diceB.selectedNumber();
		System.out.println("[" + diceB.getClass().getName()+"]의 선택된 수 : " + diceB.getValue());

		totalValue += diceB.getValue();
		System.out.println("==>" + getClass().getName()+".playDice()end...");
	}
	}
	}


