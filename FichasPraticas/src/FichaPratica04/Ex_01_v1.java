package FichaPratica04;

import java.util.Scanner;

public class Ex_01_v1 {
    public static void main(String[] args) {
        //(Ex1 tentativa teste): Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro operações aritméticas (+, -, *, /).
        // Apresente o resultado de aplicar a operação correspondente aos valores.
        // No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
        //Exemplo: Deseja continuar? (introduza s/n).

        Scanner input = new Scanner(System.in);

        int numeroUser1, numeroUser2, operacao;


        System.out.println("Introduza um valor: ");
        numeroUser1 = input.nextInt();
        System.out.println("Introduza outro valor: ");
        numeroUser2 = input.nextInt();


        do {
            System.out.println("1 = Soma");
            System.out.println("2 = Subtracao");
            System.out.println("3 = Multiplicacao");
            System.out.println("4 = Divisao");
            System.out.println("0 = Sair");
            System.out.println("Escolha a operação aritemética:");
            operacao = input.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("Soma = " + (numeroUser1 + numeroUser2));
                    break;
                case 2:
                    System.out.println("Subtracao = " + (numeroUser1 - numeroUser2));
                    break;
                case 3:
                    System.out.println("Multiplicacao = " + (numeroUser1 * numeroUser2));
                    break;
                case 4:
                    System.out.println("Divisao = " + (numeroUser1 / numeroUser2));
                    break;
                case 0:
                    System.out.println("Deseja continuar?");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (operacao != 0);
    }
}
