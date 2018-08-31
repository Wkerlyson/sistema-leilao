package com.projeto.model;

public class Lance {
	
	private double valor;
	private Usuario usuario;
	
	public Lance(double valor, Usuario usuario) {
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
