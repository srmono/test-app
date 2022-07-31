package com.dbs.sonar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dbs.sonar.controller.MessageController;

@SpringBootTest
class SonarDemoApplicationTests {
	
	@Autowired
	private MessageController controller;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testGetMessage() {
		String message = controller.getMessage();
		Assertions.assertNotNull(message);
	}

}
