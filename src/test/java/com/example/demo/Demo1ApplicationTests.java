package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ExampleService.class)
class Demo1ApplicationTests {

	@Autowired
	private ExampleService service;
	@Test
	void contextLoads() {
		assertThat("Eld").isEqualTo(service.exampleMethod(("eld")));
	}

}
