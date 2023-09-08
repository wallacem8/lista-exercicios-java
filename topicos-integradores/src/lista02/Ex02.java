package lista02;

import java.util.Scanner;

//questao 05 da lista

public class Ex02 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	        double nota1;
	        double nota2;
	      
	        do {
	            System.out.print("Digite a nota da 1ª prova: ");
	            nota1 = entrada.nextDouble();
	        } while (nota1 < 0 || nota1 > 10);
	        
	        do {
	            System.out.print("Digite a nota da 2ª prova: ");
	            nota2 = entrada.nextDouble();
	        } while (nota2 < 0 || nota2 > 10);
	        
	        double media = (nota1 + nota2) / 2;
	        
	        System.out.println("A média do aluno é: " + media);
	        
	        entrada.close();

	}

}
