package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int numerUser=0, limite, count1=0, count2=0, count3=0, count4=0;

        //count1 = total de numeros inseridos pelo utilizador no intervalo de  0 a 25.
        //count2 = total de numeros inseridos pelo utilizador no intervalo de  26 a 50.
        //count3 = total de numeros inseridos pelo utilizador no intervalo de  51 a 75.
        //count4 = total de numeros inseridos pelo utilizador no intervalo de  76 a 100.

        while (numerUser >= 0){
            System.out.println("Introduza um número: ");
            numerUser = input.nextInt();
            if (numerUser < 0){
                count1 = count1 + 1;
                System.out.println("-[0.25]: " + count1);
                
                System.out.println("-[26,50]: " + count2);
                count2 = count2 + 1;
                System.out.println("-[51,75]: " + count3);
                count3 = count3 + 1;
                System.out.println("-[76,100]: " + count4);
                count4 = count4 + 1;
            }
        }

//count1 = count1 + 1;
        //Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
        //utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100].
        //A entrada de dados deve terminar quando for lido um número negativo.
            // Se numero inserido é negativo termina



    }
}
