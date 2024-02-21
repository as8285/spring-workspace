package com.kh.aop;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CharacterTest {
	@Autowired(required = false)
	private Character character;
	@Test
	void test() {
	
	}
	@Test
	void create() {
		assertThat(character).isNotNull();
	}
	

}
