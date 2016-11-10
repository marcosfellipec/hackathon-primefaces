package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Categoria;
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
	private List<Categoria> categorias;
	
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

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Categoria> completeCategoria(String query) {
        List<Categoria> results = new ArrayList<Categoria>();
        for (Categoria a : categorias) {
        	if (a.getDescricaoCategoria().toUpperCase().contains(query.toUpperCase())){
        		results.add(a);
        	}
        }
        return results;
	}
}
