package com.wellington.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.wellington.myapi.domain.Usuario;
import com.wellington.myapi.repositories.UsuarioRepository;

@EntityScan(basePackages = "com.wellington.myapi.domain")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class MyapiApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Wellington", "wellinfc", "123");
		Usuario u2 = new Usuario(null, "Joaquim", "joca", "123");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
	}

}
