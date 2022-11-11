package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Operadores;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o 1° número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Digite o 2° número: ");
		double num2 = sc.nextDouble();
		
		
		Operadores op = new Operadores (num1, num2);
		
		System.out.print("Escolha uma operação a ser feita: \n1 - soma \n2 - subtração \n3 - multiplicação \n4 - divisão");
		System.out.println();
		int option = sc.nextInt();
		
		switch(option) {
			case 1:
				System.out.printf("Resultado de %.2f + %.2f : %.2f", num1, num2, op.soma());
			break;
			
			case 2:
				System.out.printf("Resultado de %.2f - %.2f : %.2f", num1, num2, op.subtracao());
			break;
			
			case 3:
				System.out.printf("Resultado de %.2f * %.2f : %.2f", num1, num2, op.multiplicacao());
			break;
			
			case 4:
				System.out.printf("Resultado de %.2f / %.2f : %.2f", num1, num2, op.divisao());
			break;	
		}
		
		sc.close();
		
	}

}
