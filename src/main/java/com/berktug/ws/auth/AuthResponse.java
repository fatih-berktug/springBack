package com.berktug.ws.auth;

import com.berktug.ws.user.vm.UserVM;

import lombok.Data;

@Data
public class AuthResponse {
	
	private String token;
	
	private UserVM user;

}
