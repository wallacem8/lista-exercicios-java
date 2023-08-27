package lista01;

import java.util.Scanner;

//Questão 31 da lista

public class ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Nota 2: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("Nota 3: ");
		float nota3 = entrada.nextFloat();
		
		float mediaExercicios = (nota1 + nota2 + nota3) / 3;
		
		float mediaAproveitamento = ((nota1 + nota2) * 2 + (nota3 * 3) + mediaExercicios) / 7;
		
		if (mediaAproveitamento >= 9)
			System.out.printf("Média de aproveitamento: %.1f,conceito: A", mediaAproveitamento );
		if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9)
			System.out.printf("Média de aproveitamento: %.1f conceito: B", mediaAproveitamento);
		if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5)
			System.out.printf("Média de aproveitamento: %.1f conceito: C", mediaAproveitamento);
		if (mediaAproveitamento < 6)
			System.out.printf("Média de aproveitamento: %.1f conceito: D", mediaAproveitamento);
		
		
		entrada.close();
	}

}
