package br.com.dac.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "historico_bike")
public class Historico_Bike {
	@Column
	private int id;
	
	@Column
	private Date data;
	
	@Column(name="motivo_retirada")
	private String motivoRetirada;
	
	@Column(name="id_bicicleta")
	private int idBicicleta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getMotivoRetirada() {
		return motivoRetirada;
	}
	public void setMotivoRetirada(String motivoRetirada) {
		this.motivoRetirada = motivoRetirada;
	}
	public int getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(int idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
	
	
}
