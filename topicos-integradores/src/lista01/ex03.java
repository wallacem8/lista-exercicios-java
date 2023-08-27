package lista01;

import java.util.Scanner;

//Questão 3 da lista

public class ex03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas maçãs: ");
		int quantidade = entrada.nextInt();

		float valor1 = 1.30f * quantidade;
		float valor2 = 1.0f * quantidade;

		if (quantidade < 12)
			System.out.println("R$" + valor1);
		if (quantidade >= 12)
			System.out.println("R$" + valor2);
		
		entrada.close();
	}
	
	

}
