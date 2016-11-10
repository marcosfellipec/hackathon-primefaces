package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.model.Infracoes;
import com.stefanini.model.Localinfracao;
import com.stefanini.service.AgenteService;
import com.stefanini.service.InfracaoService;
import com.stefanini.service.LocalInfracaoService;

@Named("infracaoMB")
@SessionScoped
public class InfracaoBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private InfracaoService infracaoService;
	
	@Inject
	private AgenteService agenteService;
	
	@Inject
	private LocalInfracaoService localInfacaoService;
	
	@Inject
	private Infracoes infracao;
	
	private List<Infracoes> infracoes;
	private List<Agente> agentes;
	private List<Localinfracao> locaisInfracao;
	
	@PostConstruct
	public void init() {
		getInfracoes();
		getAgentes();
		getLocaisInfracao();
	}
	
	public List<Infracoes> getInfracoes() {
		if (infracoes == null) {
			infracoes = new ArrayList<Infracoes>();
			infracoes = infracaoService.listar();
		}
		return infracoes;
	}

	public void setInfracoes(List<Infracoes> infracoes) {
		this.infracoes = infracoes;
	}

	public List<Agente> getAgentes() {
		if (agentes == null) {
			agentes = new ArrayList<Agente>();
			agentes = agenteService.listarAll();
		}
		return agentes;
	}

	public void setAgentes(List<Agente> agentes) {
		this.agentes = agentes;
	}

	public List<Localinfracao> getLocaisInfracao() {
		if (locaisInfracao == null) {
			locaisInfracao = new ArrayList<Localinfracao>();
			locaisInfracao = localInfacaoService.listar();
		}
		
		return locaisInfracao;
	}
	
	public Infracoes getInfracao() {
		if (infracao == null) {
			infracao = new Infracoes();
		}
		return infracao;
	}

	public void setInfracao(Infracoes infracao) {
		this.infracao = infracao;
	}
	
	public void inserir() {
		infracaoService.incluir(infracao);
		infracao = new Infracoes();
	}
	
	public void excluir(Infracoes infracao) {
		infracaoService.excluir(infracao);
	}
	
	public List<Agente> completeAgente(String query) {
        List<Agente> results = new ArrayList<Agente>();
        for (Agente a : agentes) {
        	if (a.getNome().toUpperCase().contains(query.toUpperCase())){
        		results.add(a);
        	}
        }
         
        return results;
    }
	
	public List<Localinfracao> completeLocalInfracao(String query) {
		List<Localinfracao> results = new ArrayList<Localinfracao>();
		for (Localinfracao local : locaisInfracao) {
			if (local.getDescricaoLocalInfracao().toUpperCase().contains(query.toUpperCase())){
				results.add(local);
			}
		}
		return results;
	}
}