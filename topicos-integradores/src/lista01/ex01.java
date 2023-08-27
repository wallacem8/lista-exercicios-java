package lista01;

import java.util.Scanner;

//Questão 1 da lista

public class ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = entrada.nextInt();
		
		if(valor > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		
		
		entrada.close();
	}

}
