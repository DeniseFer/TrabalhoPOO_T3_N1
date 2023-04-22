
package br.edu.principal;
import java.text.DecimalFormat;
import java.util.Scanner;

		public class Principal {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				double tempC = 0.0;
				
			for (double tempF = 50; tempF <= 65; tempF++){
			
		    
		        tempC = (tempF - 32) * 5/9;
		        System.out.println("======================================================");
		       
		        System.out.println("Conversão de " + tempF + " farenheits para Celsius: ");
		        System.out.println("°F -> °C: " + new DecimalFormat(".##").format(tempC));
		       
		       

			}

		}

	}


