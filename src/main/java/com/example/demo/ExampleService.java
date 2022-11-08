package com.example.demo;


import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ExampleService {
	public String exampleMethod(String str) {
		return StringUtils.capitalize(str);
	}
}
