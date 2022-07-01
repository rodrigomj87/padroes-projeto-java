package org.api.cep;

public class CepApi {
	
	private static CepApi cepLazy = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {		
		return cepLazy;
	}
	
	public String Cidade(String cep) {
		return "Mongaguá";
	}
	
	public String Estado(String cep) {
		return "SP";
	}
}
