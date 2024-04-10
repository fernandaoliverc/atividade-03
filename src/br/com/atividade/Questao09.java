package br.com.atividade;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		double temperaturaConvertida;

		while (true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("*********** BEM-VINDO(A) AO CONVERSOR DE TEMPERATURA ***********");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Converter temperatura de Celsius para Fahrenheit.");
			System.out.println("2 - Converter temperatura de Fahrenheit  para Celsius.");
			System.out.println("0 - Encerrar.");
			System.out.println("----------------------------------------------------------------");
			System.out.printf("Informe a opção que deseja escolher: ");
			opcao = entrada.nextInt();

			if (opcao == 0) {
				System.out.println("Obrigada por utilizar nossos serviços!");
				break;
			} else {
				System.out.printf("Informe a temperatura que deseja converter: ");
				double temperatura = entrada.nextDouble();

				switch (opcao) {
				case 1:
					temperaturaConvertida = (temperatura * (9.0 / 5.0)) + 32.0;
					System.out.println(
							"Temperatura convertida de Celsius para Fahrenheit = Fº: " + temperaturaConvertida);
					break;
				case 2:
					temperaturaConvertida = (temperatura - 32.0) * (5.0 / 9.0);
					System.out.println(
							"Temperatura convertida de Fahrenheit para Celsius = Cº: " + temperaturaConvertida);
					break;
				default:
					System.out.println("Opção Inválida!");
				}
			}
		}
	}
}