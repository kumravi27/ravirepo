package com.microService.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestProjectApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(RestProjectApplication.class);
	
	@Test
	void contextLoads() {
		logger.info("application test running");
		assertEquals(true, true);
	}

}
