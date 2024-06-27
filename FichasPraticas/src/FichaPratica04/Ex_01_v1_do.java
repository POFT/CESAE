package FichaPratica04;

import java.util.Scanner;

public class Ex_01_v1_do {
    public static void main(String[] args) {

        //Ex_01: Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro operações aritméticas (+, -, *, /).
        // Apresente o resultado de aplicar a operação correspondente aos valores.
        // No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
        //Exemplo: Deseja continuar? (introduza s/n).

        Scanner input = new Scanner(System.in);
        double numeroUser1, numeroUser2, resultado;
        String operacao, continuar;


        do { //FAZER...
            System.out.println("Introduza um valor: "); //Instrução
            numeroUser1 = input.nextDouble();
            System.out.println("Introduza outro valor: "); //Instrução2
            numeroUser2 = input.nextDouble();
            System.out.println("Escolha a operação aritemética (+, -, *, /): "); //Instrução3
            operacao = input.next();

            switch (operacao) { //SELECIONAR CASO... (Estrutura de seleção/escolha) igual para for ou do
                case "+":
                    resultado = numeroUser1 + numeroUser2; // garantir o calculo fora
                    System.out.println("Soma = " + resultado); // garantir o calculo fora
                    break;
                case "-":
                    resultado = numeroUser1 - numeroUser2;
                    System.out.println("Subtracao = " + resultado);
                    break;
                case "*":
                    resultado = numeroUser1 * numeroUser2;
                    System.out.println("Multiplicacao = " + resultado);
                    break;
                case "/":
                    resultado = numeroUser1 / numeroUser2;
                    System.out.println("Divisao = " + resultado);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Deseja continuar? (s/n)");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("s")); // ENQUANTO...é Verdadeira (funcao é igual a "s"), quando é falsa o ciclo termina e o algoritmo continua na instrução imediatamente a seguir.
    }//"equalsIgnoreCase" deixa de ser case sensivity
}
