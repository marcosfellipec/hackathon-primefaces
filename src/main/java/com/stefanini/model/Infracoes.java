package com.stefanini.model;
// Generated 08/11/2016 09:01:48 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "infracoes", catalog = "hackathon")
public class Infracoes implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idInfracao", unique = true, nullable = false)
	private Integer idInfracao;
	
	@OneToOne
	@JoinColumn(name = "idAgente")
	private Agente agente;

	@OneToOne
	@JoinColumn(name = "idLocalInfracao")
	private Localinfracao localInfracao;

	@OneToOne
	@JoinColumn(name = "idTipoInfracao")
	private Tipoinfracao tipoInfracao;

	@OneToOne
	@JoinColumn(name="placa")
	private Veiculos veiculo;

	@Column(name = "velocidade")
	private Integer velocidade;

	public Infracoes() {
	}

	public Infracoes(Integer idInfracao, Agente agente, Localinfracao localInfracao, Tipoinfracao tipoInfracao,
			Veiculos veiculo, Integer velocidade) {
		this.idInfracao = idInfracao;
		this.agente = agente;
		this.localInfracao = localInfracao;
		this.tipoInfracao = tipoInfracao;
		this.veiculo = veiculo;
		this.velocidade = velocidade;
	}

	public Integer getIdInfracao() {
		return this.idInfracao;
	}

	public void setIdInfracao(Integer idInfracao) {
		this.idInfracao = idInfracao;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public Localinfracao getLocalInfracao() {
		return localInfracao;
	}

	public void setLocalInfracao(Localinfracao localInfracao) {
		this.localInfracao = localInfracao;
	}

	public Tipoinfracao getTipoInfracao() {
		return tipoInfracao;
	}

	public void setTipoInfracao(Tipoinfracao tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}
	
	public Veiculos getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}

	public Integer getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

}
