package com.lambdatest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lambdatest.config.Settings;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

	private final Settings settings;

	@PostMapping("/hello")
	public void test() {

		System.out.println("Hello Lambda!");

		System.out.println(settings.getAccountId());

	}

}
