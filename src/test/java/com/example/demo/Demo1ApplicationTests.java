package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

class Demo1ApplicationTests {

	@Test
	void contextLoads() {
		assertThat("Eld").isEqualTo(StringUtils.capitalize(("eld")));
	}

}
