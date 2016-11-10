package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Localinfracao;
import com.stefanini.repository.LocalInfracaoRepository;;

@Stateless
public class LocalInfracaoService {
	@Inject
	private LocalInfracaoRepository localInfracaoRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Localinfracao localinfracao){
		localInfracaoRepository.incluir(localinfracao);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Localinfracao> listar(){
	    	
	  	return localInfracaoRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Localinfracao localinfracao){
		 localInfracaoRepository.remove(localinfracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Localinfracao localinfracao){
		 localInfracaoRepository.altera(localinfracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Localinfracao buscar(Localinfracao localinfracao){
		 return localInfracaoRepository.busca(localinfracao.getIdLocalInfracao());
	 }
}
