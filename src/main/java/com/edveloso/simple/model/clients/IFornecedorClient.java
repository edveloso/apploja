package com.edveloso.simple.model.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.edveloso.simple.service.InfoFornecedorDTO;

@FeignClient(url = "http://localhost:8081/info", name = "fornecedorClient")
public interface IFornecedorClient {
	
	@GetMapping(value = "/{estado}")
	public InfoFornecedorDTO consultar(@PathVariable String estado);
	
}
