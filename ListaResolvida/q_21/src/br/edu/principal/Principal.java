package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

int NumeroOp = 0;
int NumOpMaior = 0;
double Salario = 0;
double TotFolha = 0;
int PeçaMensal = 0;
double MediaMasc = 0;
double MediaFem = 0;
char Sexo = ' ';
int TotPeças = 0;
int contFem = 0;
int contMasc = 0;
double SalMaior = 0.0;


Scanner sc = new Scanner(System.in);

for(int cont = 1; cont <= 15; cont++) {

System.out.println("\n ========FÁBRICA FELIZ=======\n");
System.out.println("Digite o número do "+cont+"º operário:");
NumeroOp = sc.nextInt();

System.out.println("Digite a quantidade de peças feitas por mês pelo " +cont+"º operário:");
PeçaMensal = sc.nextInt();

System.out.println("Digite o seu sexo (M ou F) :");
Sexo = sc.next().toUpperCase().charAt(0);

// SALÁRIO 

if (PeçaMensal<=30){
	Salario = 150;
	}
else if (PeçaMensal >= 31 & PeçaMensal <=35 ){
	Salario = 150 + (0.03 * 150) * (PeçaMensal - 30);
}
else if (PeçaMensal > 35){
Salario = 150 + (0.05 * 150) * (PeçaMensal - 30);
}

System.out.println("O salário equivalente será: "+ Salario);

// FOLHA DE PAGAMENTO

TotFolha = TotFolha + Salario;
System.out.println("A folha de pagamento será: "+ TotFolha);

// TOTAL DE PEÇAS

TotPeças = TotPeças + PeçaMensal;
System.out.println("O total de peças será: "+ TotPeças);

if (Sexo == 'M') {
	
	MediaMasc = MediaMasc + PeçaMensal;
	contMasc = contMasc + 1;
	
}
else {
	MediaFem = MediaFem + PeçaMensal;
	contFem = contFem + 1;
}


if(cont == 1) {
	SalMaior = Salario;
	NumOpMaior = NumeroOp;
	
}
else {
	if(Salario > SalMaior) {
		SalMaior = Salario;
		NumOpMaior = NumeroOp;
	}
}

}

// FORA DO FOR

if (contMasc == 0) {
	MediaMasc = 0;
}
else {
	MediaMasc = MediaMasc/contMasc;
}
	
if (contFem == 0) {
	MediaFem = 0;
}
else {
	MediaFem = MediaFem/contFem;
}
	
System.out.println(" A média de peças fabricadas por mulheres é igual a: "+ MediaFem);
System.out.println(" A média de peças fabricadas por homens é igual a: "+ MediaMasc);

System.out.println(" O número do operário com maior salário é:  "+ NumOpMaior);

}
}