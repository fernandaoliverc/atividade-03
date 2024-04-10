package br.com.atividade;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;

		System.out.println("*********** BEM-VINDO(A) A TABUADA ***********");
		System.out.printf("Informe um número: ");
		int numero = entrada.nextInt();

		for (i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
	}
}