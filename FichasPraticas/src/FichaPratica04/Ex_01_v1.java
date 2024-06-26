package FichaPratica04;

import java.util.Scanner;

public class Ex_01_v1 {
    public static void main(String[] args) {
        //(Ex1: Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro operações aritméticas (+, -, *, /).
        // Apresente o resultado de aplicar a operação correspondente aos valores.
        // No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
        //Exemplo: Deseja continuar? (introduza s/n).

        Scanner input = new Scanner(System.in);

        int numeroUser1, numeroUser2, operacao;
        String funcao;


        // Ao colocar as questões fora do "do"/FAZER não existe repetição.
        System.out.println("Introduza um valor: ");
        numeroUser1 = input.nextInt();
        System.out.println("Introduza outro valor: ");
        numeroUser2 = input.nextInt();


        do { //FAZER...
            System.out.println("Escolha a operação aritemética:"); //Instrução
            System.out.println("1 = Soma"); // Instrução1
            System.out.println("2 = Subtracao"); // Instrução2
            System.out.println("3 = Multiplicacao"); // Instrução3
            System.out.println("4 = Divisao"); // Instrução4
            operacao = input.nextInt(); // Guardar input do user na variavel operacao

            switch (operacao) { //SELEÇÃO...
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
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Deseja continuar? (introduza s/n)");
            funcao = input.next();
        } while (funcao.equals("s")); // ENQUANTO...é Verdadeira, quando é falsa o ciclo termina e o algoritmo continua na instrução imediatamente a seguir.
    }
}
