package FichaPratica03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int inicio1, multiplos5, fim2;


        // Solicitar ao user numero
        System.out.print("Insira um valor: ");
        inicio1 = input.nextInt();
        // Solicitar ao user numero
        System.out.print("Insira um valor: ");
        fim2 = input.nextInt();


        //Ex. inicio 6 e fim 20
        // apresenta 10 e 15 e 20

        //Este programa imprime os valores multiplos de 5 (5,10,15,20...) entre valor inicio e o valor fim.
        while (inicio1 <= fim2){ //ENQUANTO inicio for inferior ou igual ao fim o programa imprime.
            if (inicio1%5==0){ //SE o resto do valor a dividir por 5 é 0 o programa imprime.
                System.out.println(inicio1);
            }
            inicio1 = inicio1 + 1;
        }
    }
}
