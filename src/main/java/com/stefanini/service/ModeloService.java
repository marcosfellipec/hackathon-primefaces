package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;
import com.stefanini.model.Modelo;
import com.stefanini.repository.ModeloRepository;

@Stateless
public class ModeloService {
	
	 @Inject
	 private ModeloRepository modeloRepository;

	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Modelo modelo){
		 modeloRepository.incluir(modelo);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Modelo> listar(){
	    	
	  	return modeloRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Modelo modelo){
		 modeloRepository.excluir(modelo);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Modelo modelo){
		 modeloRepository.altera(modelo);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Modelo buscar(Modelo modelo){
		 return modeloRepository.busca(modelo.getIdModelo());
	 }
	    

}
