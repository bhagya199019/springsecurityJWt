package com.bitlabs.Dto;

import lombok.Builder;

@Builder
public class JwtResponseDTO {
    private String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public JwtResponseDTO(String accessToken) {
		super();
		this.accessToken = accessToken;
	}

	public JwtResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
  
}