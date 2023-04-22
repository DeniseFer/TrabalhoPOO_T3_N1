package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int soma = 0;
		int numPar = 2;
		
		for(int qtd = 1; qtd <=50; qtd++) {
			soma = numPar + soma;
			numPar = numPar + 2;
		}

System.out.println("A soma dos 50 primeiros números pares é: "+soma );
			
		
		
	
	
	
	}}
