package com.projeto.model;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	
	private List<Lance> lances;
	
	private String descricao;

	public Leilao(String descricao) {
		this.descricao = descricao;
		lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		this.lances.add(lance);
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return lances;
	}
	
	
}
