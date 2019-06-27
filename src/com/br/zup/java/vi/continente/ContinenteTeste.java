package com.br.zup.java.vi.continente;

import java.util.Scanner;

public class ContinenteTeste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Continente continente = new Continente("Asiatico");


		System.out.println("Qual é a populacao total do continente?");
		long popupcaoTotal = entrada.nextLong(); 
		continente.setPopulacaoTotal(popupcaoTotal);

		System.out.println("Qual é a densidade total  do continente?");
		double densidadeTotal = entrada.nextDouble();
		continente.setDensidade(densidadeTotal);

		System.out.println("Qual é a dimensão total  do continente?");
		double dimensao = entrada.nextDouble();
		continente.setDimensaoTotal(dimensao);

		System.out.println("Qual é o nome do país?");
		String nome = entrada.next();
		System.out.println("Qual é a densidade do país?");
		long densidade = entrada.nextLong();
		System.out.println("Qual é a dimensão?");
		double dimen = entrada.nextDouble();
		
		Pais pais = new Pais(nome , densidade ,  dimen);
		continente.adicionarPais(pais);
	
		
		System.out.println("Qual é o nome do país?");
		String nome2 = entrada.next();
		System.out.println("Qual é a densidade do país?");
		long densidade2 = entrada.nextLong();
		System.out.println("Qual é a dimensão?");
		double dimen2 = entrada.nextDouble();
		
		Pais pais1 = new Pais( nome2, densidade2 , dimen2);
		continente.adicionarPais(pais1);

		
		System.out.println("Qual é o nome do país?");
		String nome3 = entrada.next();
		System.out.println("Qual é a densidade do país?");
		long densidade3 = entrada.nextLong();
		System.out.println("Qual é a dimensão?");
		double dimen3 = entrada.nextDouble();
		Pais pais2 = new Pais( nome3, densidade3,dimen3);
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
