package FichaPratica02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.

        int horas, minutos, horaConversao;

        // ler horas e minutos
        System.out.print("Introduza as horas (formato 24H): ");
        horas = input.nextInt();

        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        if (horas == 12) {
            System.out.print(horas + ":" + minutos + " " + "PM");
        }else if (horas > 12) {
            horaConversao = horas - 12;
            System.out.print(horaConversao + ":" + minutos + " " + "PM");
        }else{
            System.out.print(horas + ":" + minutos + " " + "AM");
        }







    }
}
