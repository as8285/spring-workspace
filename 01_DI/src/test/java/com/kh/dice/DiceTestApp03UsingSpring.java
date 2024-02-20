package com.kh.dice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kh.dice.impl.DiceBImpl;
import com.kh.dice.impl.Player03;
import com.kh.dice.play.Player01;
import com.kh.dice.play.Player02;
// Spring사용 !
public class DiceTestApp03UsingSpring {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/config/dice.xml"));
		Player03 player01 = (Player03)factory.getBean("");
		player01.playDice(12);
		System.out.println("=======");
		System.out.println("선택된 주사위수 총합 : " + player01.getTotalValue());
		System.out.println("=======");
		
		Player03 player02 = (Player03)factory.getBean("player02");
		player02.playDice(5);
		System.out.println("=======");
		System.out.println("선택된 주사위수 총합 : " + player02.getTotalValue());
		System.out.println("=======");

	}

}
