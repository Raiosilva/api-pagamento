package br.com.solutis.treinamento.restAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solutis.treinamento.restAPI.dao.ContaDao;
import br.com.solutis.treinamento.restAPI.model.Conta;

@Service
public class ContaService {
	
	private ContaDao dao;
	
	public ContaService (@Autowired ContaDao dao) {
		this.dao = dao;
	}
	
	public void persistOrMerge(Conta conta) {
		this.dao.save(conta);
	}
	
	public Optional<Conta> findById(Long id) {
		return this.dao.findById(id);
	}
	
	public List<Conta> findAll(){
		return dao.findAll();
	}
	
	public void delete(Conta conta) {
		this.dao.delete(conta);
	}
	
}














