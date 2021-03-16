package com.edveloso.simple.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edveloso.simple.controler.to.CompraTO;
import com.edveloso.simple.model.clients.IFornecedorClient;
import com.edveloso.simple.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraCtrl {

	@Autowired
	private CompraService compraService;
	
	@Autowired
	private IFornecedorClient fornecedorClient;
	
	@GetMapping
	public void passou() {
		System.out.println("passou"+ fornecedorClient.consultar("algo"));
	}
	
	@PostMapping
	public void realizarCompra(@RequestBody CompraTO compra) {
		compraService.realizarCompra(compra);
	}
	
}
