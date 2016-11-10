package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;
import com.stefanini.model.Telefones;
import com.stefanini.repository.TelefoneRepository;

@Stateless
public class TelefonesService {
	 @Inject
	 private TelefoneRepository telefoneRepository;

	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Telefones telefones){
		 telefoneRepository.incluir(telefones);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Telefones> listar(){
	    	
	  	return telefoneRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Telefones telefones){
		 telefoneRepository.remove(telefones);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Telefones telefones){
		 telefoneRepository.altera(telefones);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Telefones buscar(Telefones telefones){
		 return telefoneRepository.busca(telefones.getId());
	 }
	    

}
