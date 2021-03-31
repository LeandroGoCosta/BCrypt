package com.inuves.bcrypt.api.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	public static String gerarBCrypt( String senha ) {
		if (senha == null) {
			return senha;			
		}
		BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
		return bcryptEncoder.encode(senha);		
	}
	
	public static boolean senhaValida(String senha, String senhaEncoder) {
		BCryptPasswordEncoder bcryptEncoder = new BCryptPasswordEncoder();
		return bcryptEncoder.matches(senha, senhaEncoder);		
	}
	
}
