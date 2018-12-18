package br.com.dac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Bicicleta {
	
	@Column
	private int id;
	
	@Column
	private boolean ativa;
	
	@Column(name="em_uso")
	private boolean emUso;
	
	@Column(name="id_estacao")
	private int idEstacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public boolean emUso() {
		return emUso;
	}

	public void setEmUso(boolean em_uso) {
		this.emUso = em_uso;
	}

	public int getIdEstacao() {
		return idEstacao;
	}

	public void setId_estacao(int idEstacao) {
		this.idEstacao = idEstacao;
	}
	
	
}
