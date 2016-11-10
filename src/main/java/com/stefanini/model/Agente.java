package com.stefanini.model;
// Generated 07/11/2016 12:04:56 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Agente generated by hbm2java
 */
@Entity
@Table(name = "agente", catalog = "hackathon")
public class Agente implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAgente", unique = true, nullable = false)
	private Integer idAgente;
	@Column(name = "nome", length = 100)
	private String nome;
	@Temporal(TemporalType.DATE)
	@Column(name = "dtContratacao", length = 10)
	private Date dtContratacao;
	@Column(name = "tempoServico")
	private Integer tempoServico;
	@Column(name="cpfAgente", length=11, unique=true)
	private Integer cpf;
	
	public Agente() {
	}

	public Agente(String nome, Date dtContratacao, Integer tempoServico,Integer cpf) {
		this.nome = nome;
		this.dtContratacao = dtContratacao;
		this.tempoServico = tempoServico;
		this.cpf = cpf;
	}

	public Integer getIdAgente() {
		return this.idAgente;
	}

	public void setIdAgente(Integer idAgente) {
		this.idAgente = idAgente;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtContratacao() {
		return this.dtContratacao;
	}

	public void setDtContratacao(Date dtContratacao) {
		this.dtContratacao = dtContratacao;
	}

	public Integer getTempoServico() {
		return this.tempoServico;
	}

	public void setTempoServico(Integer tempoServico) {
		this.tempoServico = tempoServico;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

}
