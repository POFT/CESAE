package FichaPratica02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        //Import de Scanner
        Scanner input = new Scanner(System.in);

        // Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair).
        // Se uma das opções 1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada.
        // Caso a opção for inválida, deve informar o utilizador.

        String num;

        System.out.println("Introduza um número de acordo com a opção, 1.Criar, 2.Atualizar, 3.Eliminar, 4.Sair:");
        num = input.next();

        switch (num) {
            case "1":
                System.out.println("Escolheu a opção criar.");
                break;
            case "2":
                System.out.println("Escolheu a opção atualizar.");
                break;
            case "3":
                System.out.println("Escolheu a opção eliminar.");
                break;
            default:
                break;

        }
        }


    }
