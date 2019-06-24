package com.br.zup.java.vi.continente;

public class Pais {

	private String nome;
	private long populacaoTotal;
	private double dimensaoTotal;
	
	public Pais(String nome, long populacaoTotal, double dimensao) {
		this.nome = nome;
		this.populacaoTotal = populacaoTotal;
		this.dimensaoTotal = dimensao;
 	}

	public long getPopulacaoTotal() {
		return populacaoTotal;
	}

	public void setPopulacaoTotal(long populacaoTotal) {
		this.populacaoTotal = populacaoTotal;
	}

	public String getNome() {
		return nome;
	}

	public double getDimensaoTotal() {
		return dimensaoTotal;
	}

	public void setDimensaoTotal(double dimensaoTotal) {
		this.dimensaoTotal = dimensaoTotal;
	}
	
	
	
}
