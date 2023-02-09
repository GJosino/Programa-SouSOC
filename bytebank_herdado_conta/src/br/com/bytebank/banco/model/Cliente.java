package br.com.bytebank.banco.model;

import java.io.Serializable;

/*
 * Classe que representa um cliente no Bytebank.
 * */

public class Cliente implements Serializable {
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	private String cpf;
	private String profissao;
}