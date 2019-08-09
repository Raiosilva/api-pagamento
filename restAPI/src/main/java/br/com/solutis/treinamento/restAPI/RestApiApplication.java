package br.com.solutis.treinamento.restAPI;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.solutis.treinamento.restAPI.dao.ContaDao;
import br.com.solutis.treinamento.restAPI.model.Conta;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

	@Autowired
	private ContaDao contaDao;
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Conta c1 = new Conta();
		
		contaDao.saveAll(Arrays.asList(c1));
		
	}

}
