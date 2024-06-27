package FichaPratica04;

import java.util.Scanner;

public class Ex_01_v2_for_feio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ex_01: Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro operações aritméticas (+, -, *, /).
        // Apresente o resultado de aplicar a operação correspondente aos valores.
        // No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
        //Exemplo: Deseja continuar? (introduza s/n).

        double numeroUser1, numeroUser2, resultado;
        String operacao, continuar = "s";

        for (int i = 0;continuar.equalsIgnoreCase("s") ;i++) { //PARA...
            System.out.println("Introduza um valor: "); //Instrução
            numeroUser1 = input.nextDouble();
            System.out.println("Introduza outro valor: "); //Instrução2
            numeroUser2 = input.nextDouble();
            System.out.println("Escolha a operação aritemética (+, -, *, /): "); //Instrução3
            operacao = input.next();

            switch (operacao) { //SELECIONAR CASO... (Estrutura de seleção/escolha) igual para for ou do
                case "+":
                    resultado = numeroUser1 + numeroUser2; // garantir o calculo fora
                    System.out.println("Soma = " + resultado);// garantir o calculo fora
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
        }
    }
}
