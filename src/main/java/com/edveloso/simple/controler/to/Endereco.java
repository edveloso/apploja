package com.edveloso.simple.controler.to;

public class Endereco {

	private String rua;
	private String estado;
	private String numero;
	
	
	


	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}
	

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", estado=" + estado + ", numero=" + numero + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
