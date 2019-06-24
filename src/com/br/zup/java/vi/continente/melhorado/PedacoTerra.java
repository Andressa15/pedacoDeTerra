package com.br.zup.java.vi.continente.melhorado;

public abstract class PedacoTerra {

	private String nome;
	private double dimensaoTotal;
	private long populacaoTotal;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDimensaoTotal() {
		return dimensaoTotal;
	}

	public void setDimensaoTotal(double dimensaoTotal) {
		this.dimensaoTotal = dimensaoTotal;
	}

	public long getPopulacaoTotal() {
		return populacaoTotal;
	}

	public void setPopulacaoTotal(long populacaoTotal) {
		this.populacaoTotal = populacaoTotal;
	}
}
