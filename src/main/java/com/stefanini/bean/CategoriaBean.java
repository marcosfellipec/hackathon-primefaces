package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Categoria;
import com.stefanini.service.CategoriaService;

@Named("categoriaMB")
@SessionScoped
public class CategoriaBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Categoria categoria;
	
	@Inject
	private CategoriaService categoriaService;

	private List<Categoria> categorias;
	
	public List<Categoria> getCategorias() {
		if (categorias == null) {
			categorias = new ArrayList<Categoria>();
		}
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Categoria getCategoria() {
		if (categoria == null) {
			categoria = new Categoria();
		}
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void inserir() {
		categoriaService.incluir(categoria);
		categoria = new Categoria();
	}
	
	public void excluir(Categoria categoria) {
		categoriaService.excluir(categoria);
	}
}
