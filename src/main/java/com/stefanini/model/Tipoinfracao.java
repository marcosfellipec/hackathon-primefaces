package com.stefanini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipoinfracao", catalog = "hackathon")
public class Tipoinfracao implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoInfracao",unique=true, nullable=false)
	private Integer idTipoInfracao;
	
	@Column(name = "descricaoTipoInfracao", length = 50)
	private String descricaoTipoInfracao;
	
	@Column(name = "valor", precision = 22, scale = 0)
	private Double valor;
	
	public Tipoinfracao() {
	}

	public Tipoinfracao(String descricaoTipoInfracao, Double valor) {
		this.descricaoTipoInfracao = descricaoTipoInfracao;
		this.valor = valor;
	}

	public Integer getIdTipoInfracao() {
		return this.idTipoInfracao;
	}

	public void setIdTipoInfracao(Integer idTipoInfracao) {
		this.idTipoInfracao = idTipoInfracao;
	}

	public String getDescricaoTipoInfracao() {
		return this.descricaoTipoInfracao;
	}

	public void setDescricaoTipoInfracao(String descricaoTipoInfracao) {
		this.descricaoTipoInfracao = descricaoTipoInfracao;
	}
	
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
