package FichaPratica01;

import java.util.Scanner;

public class Ex_08_v1 {
    public static void main(String[] args) {
        //Ex_08: Escreva um programa que calcule a duração (no formato hh:mm:ss) de um álbum musical com 5 canções.
        // A duração de cada canção é lida em minutos e segundos.

        Scanner input = new Scanner(System.in); // Import Scanner - quando precisar de ler coisas do teclado

        // Declarar variaveis necessárias para o exercicio
        int segundosTotais, horas, minutos, segundos;


        // Pedir ao user os valores e guardar input do user na variavel segundosTotais
        System.out.print("- Introduza minutos da música 1: ");
        segundosTotais = (input.nextInt()) * 60;
        System.out.print("- Introduza segundos da música 1: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.print("- Introduza minutos da música 2: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;
        System.out.print("- Introduza segundos da música 2: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.print("- Introduza minutos da música 2: ");
        segundosTotais = input.nextInt();
        System.out.print("- Introduza segundos da música 2: ");
        segundosTotais = input.nextInt();

        // Ler minutos musica 3
        System.out.print("Insira os minutos da música 3: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;

        // Ler segundos da musica 3
        System.out.print("Insira os segundos da música 3: ");
        segundosTotais = segundosTotais + input.nextInt();

        // Ler minutos musica 4
        System.out.print("Insira os minutos da música 4: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;

        // Ler segundos da musica 4
        System.out.print("Insira os segundos da música 4: ");
        segundosTotais = segundosTotais + input.nextInt();

        // Ler minutos musica 5
        System.out.print("Insira os minutos da música 5: ");
        segundosTotais = segundosTotais + (input.nextInt()) * 60;

        // Ler segundos da musica 5
        System.out.print("Insira os segundos da música 5: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.println("Segundos Totais do Album: " + segundosTotais);





        // Calcular a duração (no formato hh:mm:ss)
        horas = segundosTotais/3600;
        minutos = (segundosTotais/60)-(horas*60);
        segundos = segundosTotais - (horas*3600) - (minutos*60);


        // Apresentar o resultado das operações
        System.out.println("Total do Álbum: " + horas + "h " + minutos + "m " + segundos + "s");



        // Fim do exercicio.
    }
}
