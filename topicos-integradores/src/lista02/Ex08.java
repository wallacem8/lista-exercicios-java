package lista02;

//questao 16 da lista

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int totalValores = 10;
        int negativos = 0;

        for (int i = 1; i <= totalValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = entrada.nextInt();

            if (valor < 0) {
                negativos++;
            }
        }

        System.out.println("Total de valores negativos: " + negativos);

        entrada.close();

	}

}
