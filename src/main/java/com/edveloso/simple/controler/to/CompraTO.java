package com.edveloso.simple.controler.to;

import java.util.List;

public class CompraTO {

	private List<Produto> itens;
	
	private Endereco endereco;

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "CompraTO [itens=" + itens + ", endereco=" + endereco + "]";
	}
	
}
