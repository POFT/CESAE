package FichaPratica01;

import java.util.Scanner;

public class Exercicio08_v1 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int segundosTotais, horas, minutos, segundos;

        // Ler minutos e seguntos musica 1
        System.out.print("Introduza minutos da música 1: ");
        segundosTotais = input.nextInt() * 60;

        System.out.print("Introduza segundos da música 1: ");
        segundosTotais = segundosTotais + input.nextInt();


        // Ler minutos e seguntos musica 2
        System.out.print("Introduza minutos da música 2: ");
        segundosTotais = input.nextInt() * 60;

        System.out.print("Introduza segundos da música 2: ");
        segundosTotais = segundosTotais + input.nextInt();


        // Ler minutos e seguntos musica 3
        System.out.print("Introduza minutos da música 3: ");
        segundosTotais = input.nextInt() * 60;

        System.out.print("Introduza segundos da música 3: ");
        segundosTotais = segundosTotais + input.nextInt();


        // Ler minutos e seguntos musica 4
        System.out.print("Introduza minutos da música 4: ");
        segundosTotais = input.nextInt() * 60;


        // Ler minutos e seguntos musica 5
        System.out.print("Introduza segundos da música 5: ");
        segundosTotais = segundosTotais + input.nextInt();


        System.out.print("Segundos totais: " + segundosTotais);

        horas = segundosTotais/3600;
        minutos = (segundosTotais/60) - (horas*60);
        segundos = segundosTotais - (horas*3600) - (minutos*60);

        System.out.print("O Album tem: " + horas +"h" + minutos + "m" + segundos + "s");



    }
}
