package br.com.dio.gof.java.Facade;

import org.api.cep.CepApi;

import com.api.crm.CrmService;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().Cidade(cep);
		String estado = CepApi.getInstancia().Estado(cep);
		
		CrmService.saveCliente(nome, cep, cidade, estado);
	}

}
