package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = 0.0;
		double altura = 0.0;
		double area = 0.0;
		
		System.out.println("===========CÁLCULO DE ÁREA DO TRIÂNGULO=======;");
		System.out.println("Digite a base do triangulo: ");
		base = sc.nextDouble();
		
		if(base <= 0) {
			while (base <= 0) {
				
				System.out.println("Digite a base do triangulo: ");
				base = sc.nextDouble();
			}
		}
		
		while (base > 0) {
		
		System.out.println("\nDigite a altura do triangulo: ");
		altura = sc.nextDouble();
		
		while (altura > 0) {
			area = base * altura / 2;
			System.out.println("A area do triangulo é: " + area);
			
			System.out.println("\n===========CÁLCULO DE ÁREA DO TRIÂNGULO=======;");
			System.out.println("Digite a base do triangulo: ");
			base = sc.nextDouble();
			System.out.println("Digite a altura do triangulo: ");
			altura = sc.nextDouble();}}
			}};
			
		
		


		