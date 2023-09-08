package lista02;

//questao 20 da lista

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int totalNumeros = 10;
        int soma = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = entrada.nextInt();
            soma += numero;
        }

        System.out.println("A soma total dos números é: " + soma);

        entrada.close();

	}

}
