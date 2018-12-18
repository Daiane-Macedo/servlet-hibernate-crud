package br.com.dac.entity;

import javax.persistence.Column;

public class Estacao {
	
	private int id;
	private int capacidade;
	
	@Column(name="qtd_slots_disp")
	private int qtdSlotsDisponiveis;
	
	private boolean ativa;
	private String nome;
	private float latitude;
	private float longitude;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getQtdSlotsDisponiveis() {
		return qtdSlotsDisponiveis;
	}
	public void setQtdSlotsDisponiveis(int qtdSlotsDisponiveis) {
		this.qtdSlotsDisponiveis = qtdSlotsDisponiveis;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	
}
