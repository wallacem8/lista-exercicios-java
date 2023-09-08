package lista02;

//questao 13 da lista

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número de 0 a 10: ");
		int valor = entrada.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = valor * i;
			System.out.println(valor + " x " + i + " = " + resultado);
		}
		
		entrada.close();
	}

}
