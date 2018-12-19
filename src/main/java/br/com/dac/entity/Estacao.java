package br.com.dac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name = "Estacao.findAll", query = "SELECT e FROM Estacao e")
    , @NamedQuery(name = "Estacao.findEstacaoById", query = "SELECT e FROM Estacao e WHERE e.id = :id")
    , @NamedQuery(name = "Estacao.findByAtiva", query = "SELECT e FROM Estacao e WHERE e.ativa = :ativa")})

@Entity
@Table(name = "estacao")
public class Estacao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private int capacidade;
	
	@Column(name="qtd_slots_disp")
	private int qtdSlotsDisponiveis;

	@Column
	private int ativa;

	@Column
	private String nome;
	
	@Column
	private String latitude;
	
	@Column
	private String longitude;
	
	@Column
	private String localizacao;
	
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
	public int isAtiva() {
		return ativa;
	}
	public void setAtiva(int ativa) {
		this.ativa = ativa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}
