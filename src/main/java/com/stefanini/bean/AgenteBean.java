package com.stefanini.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Named("agenteMB")
@SessionScoped
public class AgenteBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Agente agente;

	@Inject
	private AgenteService agenteService;
	private List<Agente> agentes;
	
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

	public void inserir() {
		calculaDiferenca();
		agenteService.incluir(agente);
		agentes.add(agente);
		agente = new Agente();
	}

	public void excluir(Agente agente) {
		agenteService.excluir(agente);
	}
	
	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	//TODO Verificar esse método
	@SuppressWarnings("deprecation")
	public void calculaDiferenca() {

		Date dataAtual = new Date();
		Date dataContrat = agente.getDtContratacao();

		int mesAtual = dataAtual.getMonth();
		int anoAtual = dataAtual.getYear();

		int mesContrat = dataContrat.getMonth();
		int anoContrat = dataContrat.getYear();

		int tempoServico = anoAtual - anoContrat;

		if (tempoServico > 0) {
			agente.setTempoServico(tempoServico);
			if ((mesAtual - mesContrat) > 0) {
				agente.setTempoServico(tempoServico++);
			}
		} else {
			tempoServico = 0;
			agente.setTempoServico(tempoServico);
		}
	}
}

