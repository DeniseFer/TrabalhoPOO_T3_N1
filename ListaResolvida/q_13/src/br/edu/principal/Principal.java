package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1 = 0.0;
		double nota2 = 0.0;
		int alunos;
		int total_aprovado = 0;
		int total_reprovado = 0;
		int total_exame = 0;
		double total_classe = 0;
		
			for(alunos = 1; alunos <= 6; alunos++) {	
		System.out.println("ALUNO "+alunos);
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
				
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.println("====MEDIA====");
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A media do aluno é: " + media);
		
		
		if (media <= 3) { 
			System.out.println("Aluno reprovado! ");
			System.out.println("===============================");
			total_reprovado = total_reprovado + 1; 
			} 
		else if (media > 3 && media < 7) { 
			System.out.println("O aluno precisara fazer exame final! ");
			System.out.println("===============================");
			total_exame = total_exame + 1;
			} 
		else { 
			System.out.println("Aluno aprovado! ");
			System.out.println("===============================");
			total_aprovado = total_aprovado + 1;
			}
		
 total_classe = total_classe + media;
		
		}
			
double media_classe = total_classe / 6;
		System.out.println("O total de alunos aprovados foram: " + total_aprovado); 
		System.out.println("O total de alunos que precisaram de exame foram: " + total_exame);
		System.out.println("O total de alunos reprovado foram: " + total_reprovado);
		System.out.println("A media total de notas da classe foi: " + media_classe); 
		}}