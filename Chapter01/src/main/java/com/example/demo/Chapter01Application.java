package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.demo.controller", "board.controller"})
public class Chapter01Application {

	public static void main(String[] args) {
		//SpringApplication.run(Chapter01Application.class, args);
		
		SpringApplication springApplication = new SpringApplication(Chapter01Application.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
	}

}


/*
 * - 스프링 부트로 만든 애플리케이션은 일반 자바 애플리케이션으로 실행할 수도 있고
 * - 웹 애플리케이션으로 실행할 수도 있다.
 * - 기본적으로 작성된 메인 클래스를 실행하면 웹 애플리케이션으로 실행된다.
 * - 내장 Tomcat이 구동되고 브라우저에서 전송한 요청을 처리할 수 있다.
 * - 하지만 코드를 수정하여 일반 자바 애플리케이션으로 실행하면 내장 Tomcat은 구동되지 않는다.
 * 
 * 
 * WebApplicationType 으로 설정할 수 있는 3가지 타입
	① WebApplicationType.NONE – 웹으로 동작하지 않도록 설정
	② WebApplicationType.SERVLET – 기존의 스프링 MVC를 기반으로 웹 애플리케이션을 구동하는 설정
	③ WebApplicationType.REACTIVE – 스프링 5.0에서 추가된 비동기 처리와 논블로킹 입출력을 지원하는
                                  웹플럭스(WebFlux)를 적용할 때 사용
 * 
 */
