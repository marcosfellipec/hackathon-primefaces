package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;
import com.stefanini.model.Proprietario;
import com.stefanini.repository.ProprietarioRepository;

@Stateless
public class ProprietarioService {
		
		 @Inject
		 private ProprietarioRepository propriedadeRepository;

		 @TransactionAttribute(TransactionAttributeType.REQUIRED)
		 public void incluir(Proprietario proprietario){
			 propriedadeRepository.incluir(proprietario);
		 }
		    
		 @TransactionAttribute(TransactionAttributeType.REQUIRED)
		 public List<Proprietario> listar(){
		    	
		  	return propriedadeRepository.lista();
		 }
		    
		 @TransactionAttribute(TransactionAttributeType.REQUIRED)
		 public void excluir(Proprietario proprietario){
			 propriedadeRepository.remove(proprietario);
		 }
		 
		 @TransactionAttribute(TransactionAttributeType.REQUIRED)
		 public void alterar(Proprietario proprietario){
			 propriedadeRepository.altera(proprietario);
		 }
		 
		 @TransactionAttribute(TransactionAttributeType.REQUIRED)
		 public Proprietario buscar(Proprietario proprietario){
			 return propriedadeRepository.busca(proprietario.getCpfProprietario());
		 }
		    
	}
