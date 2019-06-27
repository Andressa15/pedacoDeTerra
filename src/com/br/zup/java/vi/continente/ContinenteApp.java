package com.br.zup.java.vi.continente;

public class ContinenteApp {
	public static void main(String[] args) {


		Continente continente = new Continente("Asiatico");
		continente.setPopulacaoTotal(0);
		continente.setDensidade(1);
		continente.setDimensaoTotal(2);

		Pais pais = new Pais("Japao", 10, 17777.97);
		continente.adicionarPais(pais);

		Pais pais1 = new Pais("China", 100, 1_008_888.50);
		continente.adicionarPais(pais1);
		
		Pais pais2 = new Pais("Tailandia", 5, 1.75);
		continente.adicionarPais(pais2);
		
		System.out.println("POP tOTAL: " + continente.getPopulacaoTotal());
		System.out.println("DEN tOTAL: " + continente.getDensidade());
		System.out.println("DIM tOTAL: " + continente.getDimensaoTotal());
		Pais paisComMaiorPopulacao = continente.getPaisComMaiorPopulacao();
		System.out.println("Pais com maior populacao: " + paisComMaiorPopulacao.getNome() 
		+  " " + paisComMaiorPopulacao.getPopulacaoTotal());
		
		Pais paisComMenorPopulacao = continente.getPaisComMenorPopulacao();
		System.out.println("Pais com menor populacao: " + paisComMenorPopulacao.getNome() 
		+  " " + paisComMenorPopulacao.getPopulacaoTotal());
		
		Pais comMaiorDimensao = continente.getPaisComMaiorDimensao();
		System.out.println("Pais com maior dimensao: " + comMaiorDimensao.getNome() + " " + comMaiorDimensao.getDimensaoTotal());
		
		Pais comMenorDimensao = continente.getPaisComMenorDimensao();
		System.out.println("Pais com menor dimensao: " + comMenorDimensao.getNome() + " " + comMenorDimensao.getDimensaoTotal());
		
	

	}
}
