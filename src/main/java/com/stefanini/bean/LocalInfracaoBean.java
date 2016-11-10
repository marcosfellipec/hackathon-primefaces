package com.stefanini.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Localinfracao;
import com.stefanini.service.LocalInfracaoService;

@Named("localInfracaoMB")
@SessionScoped
public class LocalInfracaoBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private LocalInfracaoService localInfracaoService;
	
	@Inject
	private Localinfracao localInfracao;
	private List<Localinfracao> locais;

	public Localinfracao getLocalInfracao() {
		if (localInfracao == null) {
			localInfracao = new Localinfracao();
		}
		return localInfracao;
	}

	public void setLocalInfracao(Localinfracao localInfracao) {
		this.localInfracao = localInfracao;
	}
	
	public void inserir() {
		localInfracaoService.incluir(localInfracao);
		locais.add(localInfracao);
		localInfracao = new Localinfracao();
	}

	public void excluir(Localinfracao localInfracao) {
		localInfracaoService.excluir(localInfracao);
	}
	
	public List<Localinfracao> getLocais() {
		if (locais == null) {
			locais = new ArrayList<Localinfracao>();
			locais = localInfracaoService.listar();
		}
		return locais;
	}

	public void setLocaisInfracao(List<Localinfracao> locais) {
		this.locais = locais;
	}	
}