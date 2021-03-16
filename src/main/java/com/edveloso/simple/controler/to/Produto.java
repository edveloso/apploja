package com.edveloso.simple.controler.to;

public class Produto {
	
	private Integer id;
	
	private Integer quantidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", quantidade=" + quantidade + ", getId()=" + getId() + ", getQuantidade()="
				+ getQuantidade() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
