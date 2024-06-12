package FichaPratica01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int horas, minutos, segundos;


        // Ler minutos e seguntos
        System.out.print("Introduza minutos da música 1: ");
        minutos = input.nextInt();
        System.out.print("Introduza segundos da música 1: ");
        segundos = input.nextInt();

        System.out.print("Introduza minutos da música 2: ");
        minutos = minutos + input.nextInt();
        System.out.print("Introduza segundos da música 2: ");
        segundos = segundos + input.nextInt();

        System.out.print("Introduza minutos da música 3: ");
        minutos = minutos + input.nextInt();
        System.out.print("Introduza segundos da música 3: ");
        segundos = segundos + input.nextInt();

        System.out.print("Introduza minutos da música 4: ");
        minutos = minutos + input.nextInt();
        System.out.print("Introduza segundos da música 4: ");
        segundos = segundos + input.nextInt();

        System.out.print("Introduza minutos da música 5: ");
        minutos = minutos + input.nextInt();
        System.out.print("Introduza segundos da música 5: ");
        segundos = segundos + input.nextInt();



        // Calcular a duração (no formato hh:mm:ss) de um álbum musical com 5canções.
        minutos = (segundos / 60) + minutos;
        segundos = (segundos % 60);
        horas = (minutos / 60);
        minutos = (minutos % 60);
        System.out.println("Total do Album: " + horas + "h " + minutos + "m " + segundos + "s ");



    }
}
