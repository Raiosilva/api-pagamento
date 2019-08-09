package br.com.solutis.treinamento.restAPI.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "aReceber")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "ciclo")
    private String ciclo;
	
	@Column(name = "parcelas")
    private Double parcelas;
	
	@Column(name = "data_vencimento")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date data_vencimento;
	
	@Column(name = "data_pagamento")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date data_pagamento;
	
	
	@Column(name = "valor")
    private Double valor;

    public Conta (){}

    public Conta(Long id) {
		super();
		this.id = id;
	}
    
//    public Double getSubTotal() {
//    	return (preco - desconto) * quantidade;
//    }
    
//    public Double getValorTotal() {
//    	double soma =0;
//    	for (ItemPedido ip : itens) {
//    		soma = soma + ip.getSubTotal();
//    	}
//    	return soma;
//    }
    

	public Conta(Long id, String nome, String ciclo, Double parcelas, Date data_vencimento, Date data_pagamento,
			Double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.ciclo = ciclo;
		this.parcelas = parcelas;
		this.data_vencimento = data_vencimento;
		this.data_pagamento = data_pagamento;
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public Double getParcelas() {
		return parcelas;
	}

	public void setParcelas(Double parcelas) {
		this.parcelas = parcelas;
	}

	public Date getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
    
    
    
    
}
