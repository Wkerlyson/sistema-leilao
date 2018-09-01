package com.projeto.service;

import com.projeto.model.Lance;
import com.projeto.model.Leilao;
import com.projeto.model.Usuario;

public class CriadorDeLeilao {
	private Leilao leilao;

	public CriadorDeLeilao() { }

	public CriadorDeLeilao para(String descricao) {
		this.leilao = new Leilao(descricao);
		return this;
	}

	public CriadorDeLeilao lance(Usuario usuario, double valor) {
		leilao.propoe(new Lance(usuario, valor));
		return this;
	}

	public Leilao constroi() {
		return leilao;
	}
}
