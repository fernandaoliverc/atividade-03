package br.com.atividade;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("******************** BEM-VINDO(A) A CALCULADORA ********************");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Encerrar");
			System.out.println("--------------------------------------------------------------------");
			System.out.printf("Informe a opção que deseja escolher: ");
			int opcao = entrada.nextInt();

			if (opcao == 0) {
				System.out.println("Obrigada por utilizar nossos serviços!");
				break;
			} else {

				System.out.printf("Informe o primeiro número: ");
				int primeiroNumero = entrada.nextInt();
				System.out.printf("Informe o segundo número: ");
				int segundoNumero = entrada.nextInt();

				switch (opcao) {
				case 1:
					int somar = (primeiroNumero + segundoNumero);
					System.out.println(
							"O resultado da soma de " + primeiroNumero + " + " + segundoNumero + " = " + somar);
					break;
				case 2:
					int subtrair = (primeiroNumero - segundoNumero);
					System.out.println(
							"O resultado da subtração de " + primeiroNumero + " - " + segundoNumero + " = " + subtrair);
					break;
				case 3:
					int multiplicar = (primeiroNumero * segundoNumero);
					System.out.println("O resultado da multiplicação de " + primeiroNumero + " x " + segundoNumero
							+ " = " + multiplicar);
					break;
				case 4:
					if (segundoNumero != 0) {
						int dividir = (primeiroNumero / segundoNumero);
						System.out.println("O resultado da divisão de " + primeiroNumero + " ÷ " + segundoNumero + " = "
								+ dividir);
					} else {
						System.out.println("Não é possível fazer uma divisão por zero");
					}
					break;
				default:
					System.out.println("Opção Invalida!");
				}
			}
		}

	}
}
