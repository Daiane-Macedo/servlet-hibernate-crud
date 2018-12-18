package br.com.dac.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
    @NamedQuery(name = "Bicicleta.findAll", query = "SELECT b FROM Bicicleta b")
    , @NamedQuery(name = "Bicicleta.findBicicletaById", query = "SELECT b FROM Bicicleta b WHERE b.id = :id")
    , @NamedQuery(name = "Bicicleta.findByCodigo", query = "SELECT b FROM Bicicleta b WHERE b.codigo = :codigo")
    , @NamedQuery(name = "Bicicleta.findByAtiva", query = "SELECT b FROM Bicicleta b WHERE b.ativa = :ativa")})


@Entity
@Table(name = "bicicleta")
public class Bicicleta {
	@Id
	@Column
	private int id;
	
	@Column
	private boolean ativa;
	
	@Column(name="em_uso")
	private boolean emUso;
	
	@Column(name="id_estacao")
	private int idEstacao;
	
	@Column(name="codigo")
	private int codigo;

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

	public boolean isEmUso() {
		return emUso;
	}
	
	public void setEmUso(boolean em_uso) {
		this.emUso = em_uso;
	}

	public int getIdEstacao() {
		return idEstacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setIdEstacao(int idEstacao) {
		this.idEstacao = idEstacao;
	}
	
	
}
