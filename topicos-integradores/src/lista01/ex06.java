package lista01;

import java.util.Scanner;

//Questão 6 da lista

public class ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor 1: ");
		int valor1 = entrada.nextInt();
		
		System.out.print("Valor 2: ");
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2)
			System.out.println("Valor 1 é o maior: " + valor1);
		else
			System.out.println("Valor 2 é o maior: " + valor2);
		
		
		
		entrada.close();

	}

}
