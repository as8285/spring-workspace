package com.kh.dice.play;

import com.kh.dice.DiceA;

import lombok.Getter;
@Getter
public class Player01 {
	
private DiceA diceA = new DiceA();
private int totalValue;
//count��ŭ �ֻ��� ������ �ֻ��� ���� ���ϴ� ���� 
public void playDice(int count) {
	
	System.out.println("==>" + getClass().getName()+".playDice()start...");
for(int i=0;i<count;i++) {
	diceA.selectedNumber();
	System.out.println("[" + diceA.getClass().getName()+"]�� ���õ� �� : " + diceA.getValue());

	totalValue += diceA.getValue();
	System.out.println("==>" + getClass().getName()+".playDice()end...");
}
}
}
