package br.com.atividade;

public class Questao05 {
    public static void main(String[] args) {
        int numeroFibonacci;
        int auxiliarA = 0, auxiliarB = 1;

        System.out.println("*************** BEM-VINDO(A) A CALCULADORA DE FIBONACCI ****************");
        System.out.println("Resultado: " + auxiliarA);
        for (int i = 1; i <= 20; i++) {
            numeroFibonacci = auxiliarA + auxiliarB;
            auxiliarA = auxiliarB;
            auxiliarB = numeroFibonacci;

            System.out.println("Resultado: " + auxiliarA);
        }
    }
}
