package com.kh.ajax.Controller;

import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

public class MemberController {
	@PostMapping("/login"){
		String token =jwToken(id,pwd);
		model.addAttribute("token",token);
		return "result";
		
	}
	
	String token=jwToekn(id);

	private String jwtToken(String id,String pwd,Model model) {
		String token ;
		Date now = new Date();
		Date expireDate = new Date(now.getTime()+3600000);
		return Jwts.builder()
			.setSubject(id)
			.claim("pwd",pwd)
			.setIssuedAt(now)
			.setExpiration(expireDate)
			.signWith(SignagtureAlgorithm.HS512,"storage-token")
			.compact();
	}
private Claims decodeJwt(String token) {

	Jws<Claims> claims= Jwts.parser()
						.setSignKet("")
						.parseCalimsJws(token);
	return claims.getBody();
}
}
