package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Veiculos;
import com.stefanini.repository.VeiculoRepository;

@Stateless
public class VeiculoService {

	 @Inject
	 private VeiculoRepository veiculoRepository;

	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Veiculos veiculo){
		 veiculoRepository.incluir(veiculo);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Veiculos> listar(){
	    	
	  	return veiculoRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Veiculos veiculo){
		 veiculoRepository.remove(veiculo);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Veiculos veiculo){
		 veiculoRepository.altera(veiculo);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Veiculos buscar(Veiculos veiculo){
		 return veiculoRepository.busca(veiculo.getPlaca());
	 }

}
