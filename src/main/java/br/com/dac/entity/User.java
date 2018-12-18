package br.com.dac.entity;

import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Entity
@Table(name = "usuario")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column
    private Long cpf;
    
    @Column
    private String senha;
    
    @Column
    private String email;

    @Column
    private String matricula;
    
    @Column
    private Boolean pendencia;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getPendencia() {
		return pendencia;
	}

	public void setPendencia(Boolean pendencia) {
		this.pendencia = pendencia;
	}

}
