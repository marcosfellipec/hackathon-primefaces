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
	private LocalInfracaoRepository infracaoRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Localinfracao localinfracao){
		infracaoRepository.incluir(localinfracao);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Localinfracao> listar(){
	    	
	  	return infracaoRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Localinfracao localinfracao){
		 infracaoRepository.remove(localinfracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Localinfracao localinfracao){
		 infracaoRepository.altera(localinfracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Localinfracao buscar(Localinfracao localinfracao){
		 return infracaoRepository.busca(localinfracao.getIdLocalInfracao());
	 }
}
