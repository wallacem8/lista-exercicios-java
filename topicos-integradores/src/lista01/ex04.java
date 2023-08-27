package lista01;

import java.util.Scanner;

//Questão 4 da lista

public class ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Nota 2: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2)/2;


		if (media >= 6)
			System.out.println("Sua média: " + media + ", APROVADO!");
		else 
			System.out.println("Sua média: " + media + ", reprovado.");
		
		
		
		entrada.close();
	}

}
