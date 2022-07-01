package br.com.dio.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.dio.model.Endereco;
/**
 * Client HTTP, criado via <b>OpenFeign</b> para consumir a API do <b>ViaCEP</b>
 * 
 * @author RodrigoMJ87
 *
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
	
	//@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
	@GetMapping("/{cep}/json")	
	Endereco consultarCep(@PathVariable("cep") String cep);

}
