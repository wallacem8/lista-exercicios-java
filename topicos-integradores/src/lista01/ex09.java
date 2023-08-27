package lista01;

import java.util.Scanner;

//Questão 22 da lista

public class ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Time 1: ");
		String time1 = entrada.next();
		System.out.print("Gols Marcados: ");
		int golsTime1 = entrada.nextInt();

		System.out.print("Time 2: ");
		String time2 = entrada.next();
		System.out.print("Gols Marcados: ");
		int golsTime2 = entrada.nextInt();
		
		if (golsTime1 > golsTime2)
			System.out.printf("%s vencendor!", time1);
		if (golsTime2 > golsTime1)
			System.out.printf("%s vencedor!", time2);
		if (golsTime1 == golsTime2)
			System.out.println("EMPATE!");
		
		entrada.close();
	}

}
