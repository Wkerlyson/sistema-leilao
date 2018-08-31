package com.projeto.service;

import org.junit.Test;

import com.projeto.model.Lance;
import com.projeto.model.Leilao;
import com.projeto.model.Usuario;

import junit.framework.Assert;

public class AvaliadorTest {

	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		Usuario joao = new Usuario("Joao");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Playstation 3 novo");

		leilao.propoe(new Lance(250.0, maria));
		leilao.propoe(new Lance(300.0, joao));
		leilao.propoe(new Lance(400.0, jose));

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		// comparando a saída com o esperado
		double maiorEsperado = 400;
		double menorEsperado = 250;

		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.0001);
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.0001);

	}

	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		Usuario joao = new Usuario("Joao");
		
		Leilao leilao = new Leilao("Playstation 3 Novo");
		leilao.propoe(new Lance(1000.0, joao));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		Assert.assertEquals(1000, leiloeiro.getMaiorDeTodos(), 0.0001);
		Assert.assertEquals(1000, leiloeiro.getMenorDeTodos(), 0.0001);
	}

}
