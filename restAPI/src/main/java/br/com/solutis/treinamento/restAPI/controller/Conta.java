package br.com.solutis.treinamento.restAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solutis.treinamento.restAPI.service.ContaService;

@RestController
@RequestMapping("/api")
public class Conta {

	@Autowired
	private ContaService contaService;
	
    public Conta(ContaService service) {
		this.contaService = service;
	}

    @GetMapping(path = "/contas")
    public List<Conta> findAll(){
    	return contaService.findAll();
    }
    
    @GetMapping(path = "/conta/{id}")    public Optional<Conta> getContaById(@PathVariable("id") Long id ){
    	
    	return contaService.findById(id);
    }
        
    @PostMapping(path = "/conta")
    public void inserirConta(@RequestBody Conta conta) {
    	contaService.persistOrMerge(conta);
    }
    
    @PutMapping(path = "/conta/{id}")
    public void atualizarConta(@RequestBody Conta conta) {
    	contaService.persistOrMerge(conta);
    }
    
    @DeleteMapping(path = "/conta/{id}")
    public void atualizarConta(@PathVariable("id") Long id) {
    	this.contaService.delete(new Conta(id));
    }
    
}















