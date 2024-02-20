package com.kh.dice.impl;



import java.util.Random;

import com.kh.dice.Dice;

public class DiceAlmpl implements Dice{
		private int value;
		public DiceAlmpl() {
			
			System.out.println(getClass().getName()+"»ý¼ºÀÚ...");
		}
		@Override
		public void selectedNumber() {
		
			value = new Random().nextInt(6)+ 1;
		}
		@Override
		public int getValue() {
			return value;
		}
}
