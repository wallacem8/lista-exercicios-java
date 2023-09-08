package lista02;

//questao 18 da lista

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int totalValores = 10;
        double soma = 0;

        for (int i = 1; i <= totalValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = entrada.nextDouble();
            soma += valor;
  
        }

        double media = soma / totalValores;
        System.out.println("A média é: " + media);

        entrada.close();


	}

}
