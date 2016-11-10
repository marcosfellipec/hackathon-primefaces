package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.repository.AgenteRepository;


@Stateless
public class AgenteService {
	
	   @Inject
	   private AgenteRepository agenteRepository;

	   @TransactionAttribute(TransactionAttributeType.REQUIRED)
	   public void incluir(Agente agente){
	        agenteRepository.incluir(agente);
	   }
	    
	   @TransactionAttribute(TransactionAttributeType.REQUIRED)
	   public Agente buscarAgente(Agente agente){
	   	agenteRepository.busca(agente.getIdAgente());	    	
			return null;
	   }
	   
	   @TransactionAttribute(TransactionAttributeType.REQUIRED)
	   public List<Agente> listarAll(){
		   return agenteRepository.lista();
	   }
	   
	   @TransactionAttribute(TransactionAttributeType.REQUIRED)
	   public void excluir(Agente agente){
	        agenteRepository.remove(agente);
	   }
	   
	   @TransactionAttribute(TransactionAttributeType.REQUIRED)
	   public void alterar(Agente agente){
	        agenteRepository.altera(agente);
	   }
}
