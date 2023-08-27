package lista01;

import java.util.Scanner;

//Questão 11 da lista

public class ex08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int conta = entrada.nextInt();
		
		System.out.print("Digite seu saldo: ");
		double saldo = entrada.nextDouble();
		
		System.out.print("Digite seu débito: ");
		double debito = entrada.nextDouble();
		
		System.out.print("Digite seu crédito: ");
		double credito = entrada.nextDouble();
		
		double saldoAtual = (saldo - debito) + credito;
		
		System.out.printf("O saldo atual da conta %d é de R$ %.2f", conta, saldoAtual);
		
		entrada.close();
	}

}
