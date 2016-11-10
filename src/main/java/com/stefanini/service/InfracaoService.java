package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Infracoes;
import com.stefanini.repository.InfracaoRepository;

@Stateless
public class InfracaoService {

	 @Inject
	 private InfracaoRepository infracaoRepository;

	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Infracoes infracao){
		 infracaoRepository.incluir(infracao);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Infracoes> listar(){
	    	
	  	return infracaoRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Infracoes infracao){
		 infracaoRepository.remove(infracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Infracoes infracao){
		 infracaoRepository.altera(infracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Infracoes buscar(Infracoes infracao){
		 return infracaoRepository.busca(infracao.getIdInfracao());
	 }
}
