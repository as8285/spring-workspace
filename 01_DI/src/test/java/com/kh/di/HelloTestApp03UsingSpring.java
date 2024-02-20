package com.kh.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class HelloTestApp03UsingSpring {

	public static void main(String[] args) {
		
		// 1+2. BeanFactory ����
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/main/resources/config/hello.xml"));
		
		// 3. factory ���� hello �̸��� ���� Hello ��ü ��û
		Hello hello = (Hello) factory.getBean("hello");
		
		// 4. printMessage() ȣ��
		hello.printMessage();
		
		
		
		
	}

}