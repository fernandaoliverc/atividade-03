package br.com.atividade;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;

        System.out.println("***** BEM-VINDO(A) A CALCULADORA DE MÉDIA, PARA SAIR DIGITE UM NÚMERO NEGATIVO *****");
        do {
            System.out.printf("Informe um número: ");
            numero = entrada.nextInt();
            if (numero >= 0) {
                soma += numero;
                contador++;
            }
        } while (numero > 0);

        double media = (double) soma / contador;
        System.out.println("Media: " + media);
    }
}
/*6 - Faça um programa que solicite ao usuário números inteiros positivos.
 *Quando o usuário digitar um número negativo,
 *o programa deve exibir a média dos números inseridos até aquele momento.
 */