package com.example.today;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication@RestController
public class TodayApplication {
@GetMapping("/hi")
public String hi(){

  return "Hello Today";
}
	public static void main(String[] args) {
		SpringApplication.run(TodayApplication.class, args);
	}

}
