package br.com.atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> listaItens = new ArrayList<>();

		while (true) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("*************** BEM-VINDO(A) A LISTA DE COMPRAS ****************");
			System.out.println("***** Escolha uma das Opções abaixo:");
			System.out.println("1 - Inserir item na lista.");
			System.out.println("0 - Encerrar.");
			System.out.println("----------------------------------------------------------------");
			System.out.printf("Informe a opção que deseja escolher: ");
			int opcao = entrada.nextInt();
			entrada.nextLine();

			if (opcao == 0) {
				System.out.println("Obrigada por utilizar nossos serviços!");
				System.out.println("########## Lista Atualizada ##########");
				for (int i = 0; i < listaItens.size(); i++) {
					System.out.println((i + 1) + ". " + listaItens.get(i));
				}
				break;
			} else {
				switch (opcao) {
				case 1:
					System.out.print("Insira um item na lista: ");
					String item = entrada.nextLine();
					listaItens.add(item);
					System.out.println("########## Lista Atualizada ##########");
					for (int i = 0; i < listaItens.size(); i++) {
						System.out.println((i + 1) + ". " + listaItens.get(i));
					}
					break;
				default:
					System.out.println("Opção inválida.");
					break;
				}
			}
		}
	}
}