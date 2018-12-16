package br.com.dac.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Historico {
	
	@Column
	private int id;
	
	@Column
	private String acao;
	
	@Column(name = "data_inicio")
	private Date dataInicio;
	
	@Column(name = "data_fim")
	private Date dataFim;
	
	@Column
	private int matricula;
	
	@Column
	private Boolean pendencia;
	
	@Column(name = "id_bicicleta")
	private int idBicicleta;
	
	@Column(name = "id_estacao")
	private int idEstacao;
	
	@Column(name = "id_usuario")
	private int idUsuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Boolean getPendencia() {
		return pendencia;
	}

	public void setPendencia(Boolean pendencia) {
		this.pendencia = pendencia;
	}

	public int getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public int getIdEstacao() {
		return idEstacao;
	}

	public void setIdEstacao(int idEstacao) {
		this.idEstacao = idEstacao;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
}
