package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Localinfracao;

public class LocalInfracaoRepository {

	@Inject
	private EntityManager manager;

	public void incluir(Localinfracao localInfracao) {
		this.manager.persist(localInfracao);
	}

	public void altera(Localinfracao localInfracao) {
		this.manager.merge(localInfracao);
	}

	public Localinfracao busca(Integer id) {
		return this.manager.find(Localinfracao.class, id);
	}

	public List<Localinfracao> lista() {
		return this.manager.createQuery("select c from LocalInfracao c", Localinfracao.class)
				.getResultList();
	}
	
	public void remove(Localinfracao localInfracao) {
		this.manager.remove(localInfracao);
	}
}
