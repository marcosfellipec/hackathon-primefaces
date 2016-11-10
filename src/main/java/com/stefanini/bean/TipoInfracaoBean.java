package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipoinfracao;
import com.stefanini.service.TipoInfracaoService;

@Named("tipoInfracaoMB")
@SessionScoped
public class TipoInfracaoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private TipoInfracaoService tipoInfracaoService;
	
	@Inject
	private Tipoinfracao tipoInfracao;
	private List<Tipoinfracao> tipos;

	public Tipoinfracao getTipoInfracao() {
		return tipoInfracao;
	}

	public void setTipoInfracao(Tipoinfracao tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}
	
	public void inserir() {
		tipoInfracaoService.incluir(tipoInfracao);
		tipos.add(tipoInfracao);
		tipoInfracao = new Tipoinfracao();
	}

	public List<Tipoinfracao> getTipos() {
		if (tipos == null) {
			tipos = new ArrayList<Tipoinfracao>();
			tipos = tipoInfracaoService.listar();
		}
		return tipos;
	}

	public void setTipos(List<Tipoinfracao> tipos) {
		this.tipos = tipos;
	}
	
}