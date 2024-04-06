package com.lambdatest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@PostMapping("/hello")
	public void test() {

		System.out.println("Hello Lambda!");

	}

}
