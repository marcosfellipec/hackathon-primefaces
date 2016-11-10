package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Modelo;
import com.stefanini.service.ModeloService;

@Named("modeloMB")
@SessionScoped
public class ModeloBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Modelo modelo;
	
	@Inject
	private ModeloService modeloService;

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
	public void inserir() {
		modeloService.incluir(modelo);
		modelo = new Modelo();
	}
}
