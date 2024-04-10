package br.com.atividade;

public class Questao03 {
	public static void main(String[] args) {
		int soma = 0;

		System.out.println("***** SOMANDO OS PARES DE 1 A 100 *****");
		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0) {
				soma += i;
			}
		}
		System.out.println("Resultado: " + soma);
	}
}