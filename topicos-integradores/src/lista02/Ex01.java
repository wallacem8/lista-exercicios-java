package lista02;

import java.util.Scanner;

//questao 01 da lista

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		
		double valor2;
		
		do {
			System.out.print("Digite outro valor, não pode ser zero: ");
			valor2 = entrada.nextDouble();
		} while (valor2 == 0);
		
		double resultado = valor1 / valor2;
		
		System.out.println("Resultado: " + resultado);
		
		entrada.close();

	}

}
