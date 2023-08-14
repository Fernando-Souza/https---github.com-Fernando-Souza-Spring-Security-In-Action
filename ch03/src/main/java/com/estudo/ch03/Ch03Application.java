package com.estudo.ch03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


@SpringBootApplication
public class Ch03Application {


 public void m() {
        UserDetails u = User.withUsername("bill")
                .password("12345")
                .authorities("read", "write")
                .accountExpired(false)
                .disabled(true)
                .build();


    }

	public static void main(String[] args) {
		SpringApplication.run(Ch03Application.class, args);
	}

}
