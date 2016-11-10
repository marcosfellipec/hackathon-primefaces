package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Tipotelefone;
import com.stefanini.repository.TipoTelefoneRepository;;

@Stateless
public class TipoTelefoneService {

	 @Inject
	 private TipoTelefoneRepository tipoTelefoneRepository;

	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Tipotelefone tipotelefone){
		 tipoTelefoneRepository.incluir(tipotelefone);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Tipotelefone> listar(){
	    	
	  	return tipoTelefoneRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Tipotelefone tipotelefone){
		 tipoTelefoneRepository.remove(tipotelefone);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Tipotelefone tipotelefone){
		 tipoTelefoneRepository.altera(tipotelefone);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Tipotelefone buscar(Tipotelefone tipotelefone){
		 return tipoTelefoneRepository.busca(tipotelefone.getIdTipoTelefone());
	 }
}
