package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Telefones;
import com.stefanini.service.TelefonesService;

@Named("telefoneMB")
@SessionScoped
public class TelefoneBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Telefones telefone;
	
	@Inject
	private TelefonesService telefoneService;

	public Telefones getTelefone() {
		if (telefone == null) {
			telefone = new Telefones();
		}
		return telefone;
	}

	public void setTelefone(Telefones telefone) {
		this.telefone = telefone;
	}
	
	public void inserir() {
		telefoneService.incluir(telefone);
		telefone = new Telefones();
	}
	
}