package br.com.atividade;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador = 0;

		System.out.println("********* BEM-VINDO(A) A CALCULADORA DE NÚMEROS PRIMOS *********");
		System.out.print("Informe um número: ");
		int numero = entrada.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}

		if (contador == 2) {
			System.out.println("É um número primo");
		} else {
			System.out.println("Não é um numero primo!");
		}
	}
}
