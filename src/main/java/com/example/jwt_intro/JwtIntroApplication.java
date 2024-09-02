package com.example.jwt_intro;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JwtIntroApplication {

	public static void main(String[] args) {

		SpringApplication.run(JwtIntroApplication.class, args);
	}

	@Bean /* modelmapper use karanawa nm @Bean annotation eka danna one nattam wada na */
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}


}
