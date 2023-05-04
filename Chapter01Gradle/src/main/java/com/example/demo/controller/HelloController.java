package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {

	public HelloController() {
		System.out.println("HelloController 기본 생성자");
		
	}
	
	@GetMapping(value="/hello")
	//@ResponseBody
	public String hello(String name) {
		return "안녕하세욤" + name + "님";
	}
}


//RestController 를 사용하면, ResponseBody 어노테이션 사용 안해도됨