package lista01;

import java.util.Scanner;

//Questão 5 da lista

public class ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Ano de nascimento: ");
		int ano = entrada.nextInt();
		
		int idade = 2023 - ano;
		
		if (idade >= 16)
			System.out.println("sua idade: " + idade + " anos, Pode votar.");
		else
			System.out.println("sua idade: " + idade + " anos, Não pode votar.");
		
		
		entrada.close();
	}

}
