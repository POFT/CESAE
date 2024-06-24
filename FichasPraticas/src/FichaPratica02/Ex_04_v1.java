package FichaPratica02;

import java.util.Scanner;

public class Ex_04_v1 {
    public static void main(String[] args) {
        //Ex_04: Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
            // a. 1º Lugar: 10 pontos
            // b. 2º Lugar: 8 pontos
            // c. 3º Lugar: 6 pontos
            // d. 4º Lugar: 5 pontos
            // e. 5º Lugar: 4 pontos
            // f. 6º Lugar: 3 pontos
            // g. 7º Lugar: 2 pontos
            // h. 8º Lugar: 1 ponto
        //Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        int lugarPiloto;

        System.out.println("- Introduza o lugar em que o piloto terminou: "); //Pedir ao user o lugar
        lugarPiloto = input.nextInt();


        switch (lugarPiloto) { //Condição é o lugar do piloto, SELECIONAR... CASO...
            case 1:
                System.out.print("Ganhou 10 pontos.");
                break;
            case 2:
                System.out.print("Ganhou 8 pontos.");
                break;
            case 3:
                System.out.print("Ganhou 6 pontos.");
                break;
            case 4:
                System.out.print("Ganhou 5 pontos.");
                break;
            case 5:
                System.out.print("Ganhou 4 pontos.");
                break;
            case 6:
                System.out.print("Ganhou 3 pontos.");
                break;
            case 7:
                System.out.print("Ganhou 2 pontos.");
                break;
            case 8:
                System.out.print("Ganhou 1 pontos.");
                break;
            default:
                System.out.print("Não ganhou pontos.");
                break;
        }
    }
}
