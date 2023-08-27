package lista01;

import java.util.Scanner;

//Questão 14 da lista

public class ex07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero > 0)
			System.out.println("Positivo");
		if (numero < 0)
			System.out.println("Negativo");
		if (numero == 0)
			System.out.println("Zero");
		
		entrada.close();

	}

}
