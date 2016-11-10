package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;

@Named("proprietarioMB")
@SessionScoped
public class ProprietarioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Proprietario proprietario;
	
	@Inject
	private ProprietarioService proprietarioService;
	
	private List<Proprietario> proprietarios;

	public List<Proprietario> getProprietarios() {
		if (proprietarios == null) {
			proprietarios = new ArrayList<Proprietario>();
			proprietarios = proprietarioService.listar();
		}
		return proprietarios;
	}

	public void setProprietarios(List<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}

	public Proprietario getProprietario() {
		if (proprietario == null) {
			proprietario = new Proprietario();
		}
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	public void inserir() {
		proprietarioService.incluir(proprietario);
		proprietarios.add(proprietario);
		proprietario = new Proprietario();
	}	
}