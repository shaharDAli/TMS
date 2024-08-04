package com.tms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.dto.LoginRequestDto;
import com.tms.dto.LoginResponseDto;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@PostMapping("/login")
	public LoginResponseDto login(@RequestBody LoginRequestDto loginRequestDto) {
		return LoginResponseDto.builder()
				.accessToken("here token")
				.build();
	}
}
