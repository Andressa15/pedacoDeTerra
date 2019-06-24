package com.br.zup.java.vi.continente;

import java.util.ArrayList;
import java.util.List;

/*Um continente possui um nome e é composto por um conjunto de países
 * 
a) Construtor que inicialize o nome do continente; 
b) Um método que permite adicionar países aos continentes; 
c) Um método que retorne a dimensão total do continente; 
d) Um método que retorne a população total do continente; 
e) Um método que retorne a densidade populacional do continente; 
f) Um método que retorne o país com maior população no continente; 
g) Um método que retorne o país com menor população no continente; 
h) Um método que retorne o país de maior dimensão territorial no continente; 
i) Um método que retorne o país de menor dimensão territorial no continente; 
 */

public class Continente {

	private String nome;
	private double dimensaoTotal;
	private long populacaoTotal;
	private double densidade;
	private List<Pais> conjuntoPaises;

	public Continente(String nome) {
		this.nome = nome;
		this.conjuntoPaises = new ArrayList<Pais>();
	}

	public void adicionarPais(Pais p) {
		conjuntoPaises.add(p);
	}

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

	public double getDensidade() {
		return densidade;
	}

	public void setDensidade(double densidade) {
		this.densidade = densidade;
	}

	public List<Pais> getConjuntoPaises() {
		return conjuntoPaises;
	}

	public void setConjuntoPaises(List<Pais> conjuntoPaises) {
		this.conjuntoPaises = conjuntoPaises;
	}

	public Pais getPaisComMaiorPopulacao(){
		Pais paisComMaiorPopulacao = conjuntoPaises.get(0);

		for(int i = 1; i < conjuntoPaises.size(); i++) {
			if(paisComMaiorPopulacao.getPopulacaoTotal() < conjuntoPaises.get(i).getPopulacaoTotal()) {
				paisComMaiorPopulacao = conjuntoPaises.get(i);
			}
		}

		return paisComMaiorPopulacao;
	}	
	public Pais getPaisComMenorPopulacao() {
		Pais comMenorPopulacao = conjuntoPaises.get(0);

		for(int i = 1; i < conjuntoPaises.size(); i++) {
			if(conjuntoPaises.get(i).getPopulacaoTotal() < comMenorPopulacao.getPopulacaoTotal()) {
				comMenorPopulacao = conjuntoPaises.get(i);
			}
		}
		return comMenorPopulacao;

	}
	public Pais getPaisComMaiorDimensao() {
		Pais comMaiorDimensao = conjuntoPaises.get(0);

		for(int i = 1; i < conjuntoPaises.size(); i++) {
			if(conjuntoPaises.get(i).getDimensaoTotal() > comMaiorDimensao.getDimensaoTotal()) {
				comMaiorDimensao = conjuntoPaises.get(i);
			}
		}
		return comMaiorDimensao;
	}
	public Pais getPaisComMenorDimensao() {
		Pais comMenorDimensao = conjuntoPaises.get(0);

		for(int i = 1; i < conjuntoPaises.size(); i++) {
			if(conjuntoPaises.get(i).getDimensaoTotal() < comMenorDimensao.getDimensaoTotal()) {
				comMenorDimensao = conjuntoPaises.get(i);
			}
		}
		return comMenorDimensao;

	}

}

