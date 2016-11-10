package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import java.util.List;
import com.stefanini.model.Tipoinfracao;
import com.stefanini.repository.TipoInfracaoRepository;;

@Stateless
public class TipoInfracaoService {
	
	 @Inject
	 private TipoInfracaoRepository infracaoRepository;

	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void incluir(Tipoinfracao tipoInfracao){
		 infracaoRepository.incluir(tipoInfracao);
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public List<Tipoinfracao> listar(){
	    	
	  	return infracaoRepository.lista();
	 }
	    
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void excluir(Tipoinfracao tipoInfracao){
		 infracaoRepository.remove(tipoInfracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public void alterar(Tipoinfracao tipoInfracao){
		 infracaoRepository.altera(tipoInfracao);
	 }
	 
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	 public Tipoinfracao buscar(Tipoinfracao tipoInfracao){
		 return infracaoRepository.busca(tipoInfracao.getIdTipoInfracao());
	 }

}
