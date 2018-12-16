package br.com.dac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Bicicleta {
	
	@Column
	private int id;
	
	@Column
	private boolean ativa;
	
	@Column
	private boolean em_uso;
	
	@Column
	private int id_estacao;

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

	public boolean isEm_uso() {
		return em_uso;
	}

	public void setEm_uso(boolean em_uso) {
		this.em_uso = em_uso;
	}

	public int getId_estacao() {
		return id_estacao;
	}

	public void setId_estacao(int id_estacao) {
		this.id_estacao = id_estacao;
	}
	
	
}
