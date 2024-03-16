package com.kh.dice.play;

import com.kh.dice.Dice;

import lombok.Data;

@Data
public class Player03 {
	private Dice dice;
	private int totalValue;
	
	public Player03(Dice dice) {
		this.dice = dice;
	}

	// count만큼 주사위 굴려서 주사위 합을 구하는 로직
	public void playDice(int count) {
		System.out.println("==> " + getClass().getName() + ".playDice() start...");

		for (int i = 0; i < count; i++) {
			dice.selectedNumber();
			System.out.println("[ " + dice.getClass().getName() + " ] 의 선택된 수 : " + dice.getValue());
			totalValue += dice.getValue();
		}

		System.out.println("==> " + getClass().getName() + ".playDice() end...");
	}

}
