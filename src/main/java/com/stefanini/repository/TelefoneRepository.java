package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Telefones;

public class TelefoneRepository {
	
	@Inject
	private EntityManager manager;

	public void incluir(Telefones telefone) {
		this.manager.persist(telefone);
	}

	public void altera(Telefones telefone) {
		this.manager.merge(telefone);
	}

	public Telefones busca(Integer id) {
		return this.manager.find(Telefones.class, id);
	}

	public List<Telefones> lista() {
		return this.manager.createQuery("select c from Telefones c", Telefones.class)
				.getResultList();
	}
	
	public void remove(Telefones telefone) {
		this.manager.remove(telefone);
	}
}
