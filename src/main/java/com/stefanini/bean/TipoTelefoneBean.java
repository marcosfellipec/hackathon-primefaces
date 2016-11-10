package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipotelefone;
import com.stefanini.service.TipoTelefoneService;

@Named("tipoTelefoneMB")
@SessionScoped
public class TipoTelefoneBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Tipotelefone tipoTelefone;
	
	@Inject
	private TipoTelefoneService tipoTelefoneService;
	private List<Tipotelefone> tiposTelefones;
	
	public Tipotelefone getTipoTelefone() {
		if (tipoTelefone == null){
			tipoTelefone = new Tipotelefone();
		}
		return tipoTelefone;
	}

	public void setTipoTelefone(Tipotelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	public void inserir() {
		tipoTelefoneService.incluir(tipoTelefone);
		tipoTelefone = new Tipotelefone();
	}

	public List<Tipotelefone> getTiposTelefones() {
		if (tiposTelefones == null) {
			tiposTelefones = new ArrayList<Tipotelefone>();
			tiposTelefones = tipoTelefoneService.listar();
		}
		return tiposTelefones;
	}

	public void setTiposTelefones(List<Tipotelefone> tiposTelefones) {
		this.tiposTelefones = tiposTelefones;
	}
	
}