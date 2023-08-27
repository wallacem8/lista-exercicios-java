package lista01;

import java.util.Scanner;

//Questão 2 da lista

public class ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = entrada.nextInt();

		if (valor >= 0) {
			System.out.println("POSITIVO!");
		} else {
			System.out.println("NEGATIVO!");
		}

		entrada.close();
	}

}
