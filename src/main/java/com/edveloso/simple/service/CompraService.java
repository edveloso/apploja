package com.edveloso.simple.service;

import org.springframework.stereotype.Service;

import com.edveloso.simple.controler.to.CompraTO;

@Service
public class CompraService {

	

	
	
	public void realizarCompra(CompraTO compra) {
		System.out.println("Veio para o service " + compra);
	}

	
	
}
