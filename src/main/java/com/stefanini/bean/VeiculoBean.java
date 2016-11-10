package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Veiculos;
import com.stefanini.service.VeiculoService;

@Named("veiculoMB")
@SessionScoped
public class VeiculoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Veiculos veiculo;
	
	@Inject
	private VeiculoService veiculoService;
	
	public void inserir() {
		veiculoService.incluir(veiculo);
		veiculo = new Veiculos();
	}

	public Veiculos getVeiculo() {
		if (veiculo == null) {
			veiculo = new Veiculos();
		}
		return veiculo;
	}

	public void setVeiculo(Veiculos veiculo) {
		this.veiculo = veiculo;
	}	
}