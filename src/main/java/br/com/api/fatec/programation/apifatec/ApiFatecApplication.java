package br.com.api.fatec.programation.apifatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController

@SpringBootApplication
public class ApiFatecApplication {
	
	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
	
	@RequestMapping("/hello")
	String home2() {
		return "hello world 2";
	}
	
	@RequestMapping("/numero")
	Integer home3() {
		return 25042003;
	}
	@RequestMapping("/numero/{num}")
	Integer home4(@PathVariable Integer num ) {
		return num;
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
	}

}
