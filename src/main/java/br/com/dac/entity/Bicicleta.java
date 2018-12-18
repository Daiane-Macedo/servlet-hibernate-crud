package br.com.dac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery(name = "Bicicleta.findAll", query = "SELECT b FROM Bicicleta b")
    , @NamedQuery(name = "Bicicleta.findByIdBicicleta", query = "SELECT b FROM Bicicleta b WHERE b.idBicicleta = :idBicicleta")
    , @NamedQuery(name = "Bicicleta.findByCodigo", query = "SELECT b FROM Bicicleta b WHERE b.codigo = :codigo")
    , @NamedQuery(name = "Bicicleta.findByAtiva", query = "SELECT b FROM Bicicleta b WHERE b.ativa = :ativa")})

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
