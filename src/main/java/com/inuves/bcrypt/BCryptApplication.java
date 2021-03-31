package com.inuves.bcrypt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inuves.bcrypt.api.util.SenhaUtils;

@SpringBootApplication
public class BCryptApplication {

	public static void main(String[] args) {
		SpringApplication.run(BCryptApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoder = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha endoded:"+senhaEncoder);
			
			senhaEncoder = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha endoded Novamente:"+senhaEncoder);
			
			
			System.out.println("Senha valida:"+SenhaUtils.senhaValida("123456", senhaEncoder));
		};
	}
	

}
