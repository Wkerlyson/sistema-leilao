package com.projeto.model;

public class Lance {
	
	private double valor;
	private Usuario usuario;
	
	public Lance(Usuario usuario, double valor) {
		this.valor = valor;
		this.usuario = usuario;
	}

	public double getValor() {
		return valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
		

}
