package br.com.atividade;

import java.util.Random;
import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		int numeroPremiado = random.nextInt(100) + 1;

		System.out.print("Informe um número de 1 até 100: ");
		int numeroEscolhido = entrada.nextInt();

		if (numeroEscolhido == numeroPremiado) {
			System.out.println("Parabéns, você acertou!");
		} else if (numeroEscolhido < numeroPremiado) {
			System.out.println("O numero da sorte é maior que o número que você digitou.");
		} else {
			System.out.println("O número da sorte é menor que o número que você digitou.");
		}
	}
}