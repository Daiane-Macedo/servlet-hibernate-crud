package br.com.dac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Administrador {
	
	@Column
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private int cpf;
	
	@Column
	private String senha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
