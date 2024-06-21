package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int inicio1, fim2;

        // representando os valores início e fim de um intervalo e imprima os múltiplos de 5 entre eles.

        // Solicitar ao user numero
        System.out.println("Insira um valor: ");
        inicio1 = input.nextInt();

        // Solicitar ao user numero
        System.out.println("Insira um valor: ");
        fim2 = input.nextInt();

        // Este programa imprime os valores multiplos de 5 (5,10,15,20...) entre valor inicio e o valor fim
        while (inicio1 <= fim2) {
            if (inicio1%5==0){
                System.out.println(inicio1);
                inicio1 = inicio1 + 5;

            }
            //System.out.println(inicio1);
            //inicio1 = inicio1 + 5;

        }
        //Ex. inicio 6 e fim 20
        // apresenta 10 e 15 e 20


    }
}
