package FichaPratica02;

import java.util.Scanner;

public class Ex_12_v1 {
    public static void main(String[] args) {

        //Import de Scanner
        Scanner input = new Scanner(System.in);

        // Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair).
        // Se uma das opções 1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada.
        // Caso a opção for inválida, deve informar o utilizador.

        int opcao;

        System.out.println("1.Criar,");
        System.out.println("2.Atualizar,");
        System.out.println("3.Eliminar,");
        System.out.println("4.Sair");

        System.out.println("Introduza um número de acordo com a opção:");
        opcao = input.nextInt();

        switch (opcao) {
            case 1: //Criar
                System.out.println("***Criar***");
                break;
            case 2: // Atualizar
                System.out.println("***Atualizar***");
                break;
            case 3: // Eliminar
                System.out.println("***Eliminar***");
                break;
            case 4: // Sair
                System.out.println();
                break;
            default:
                break;

        }
    }


}

