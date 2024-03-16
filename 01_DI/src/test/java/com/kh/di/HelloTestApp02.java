package com.kh.di;

public class HelloTestApp02 {

	public static void main(String[] args) {
		
		// 1. 사용할 Bean 정보를 갖고있는 hello.properties를
		//    parsing, Bean 객체 생성할 HelloFactory 객체 생성
		HelloFactory factory = HelloFactory.getInstance();
		
		// 2. factory 객체로 parsing 할 리소스(hello.properties) 전달
		factory.setConfigResource("./src/main/resources/config/hello.properties");
		
		// 3. factory 한테 hello 이름을 갖는 Hello 객체 요청
		Hello hello = factory.getBean("hello");
		
		// 4. printMessage() 호출
		hello.printMessage();
		
		
		
		
	}

}
