package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int ano_atual = 0;
		double salario = 1000;
		double percentual_num = 0.015;
		double novo_salario = salario + percentual_num * salario;
		
		System.out.println("=============CÁLCULO DE SALÁRIO============");
		
		System.out.println("Digite em que ano estamos: ");
		ano_atual = sc.nextInt();
		
		for (i=1997; i<= ano_atual; i++){
			percentual_num = percentual_num * 2;
			novo_salario = novo_salario + percentual_num * novo_salario;
			}
		
		System.out.println("============RESULTADO============");
		System.out.println("O novo salario será: "+ new DecimalFormat(".##").format(novo_salario));

	}

}
