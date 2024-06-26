package FichaPratica04;

import java.util.Scanner;

public class Ex_01_v3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int numeroUser1, numeroUser2;
        String operacao;

        for (int funcao = 0;funcao != 0;funcao++) { //PARA...
            System.out.println(funcao);
            System.out.println("Introduza um valor: "); //Instrução
            numeroUser1 = input.nextInt();
            System.out.println("Introduza outro valor: "); //Instrução2
            numeroUser2 = input.nextInt();
            System.out.println("Escolha a operação aritemética (+, -, *, /): "); //Instrução3
            operacao = input.next();

            switch (operacao) { //SELECIONAR CASO... (Estrutura de seleção/escolha)
                case "+":
                    System.out.println("Soma = " + (numeroUser1 + numeroUser2));
                    break;
                case "-":
                    System.out.println("Subtracao = " + (numeroUser1 - numeroUser2));
                    break;
                case "*":
                    System.out.println("Multiplicacao = " + (numeroUser1 * numeroUser2));
                    break;
                case "/":
                    System.out.println("Divisao = " + (numeroUser1 / numeroUser2));
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Deseja continuar? (introduza 1. Sim/0. Não");
            funcao = input.nextInt();
        }
    }
}
