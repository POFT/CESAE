package FichaPratica03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        //Ex_15:Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo while.
        //Exemplo de Fatorial de 5: 5x4x3x2x1=120

        //REVER

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int numeroUser, inicio=1, fatorial = 1;

        System.out.print("- Introduza um numero: ");
        numeroUser = input.nextInt();

        if (numeroUser < 0){
            System.out.println("Número inválido!");
        }else {

            while (inicio <= numeroUser) {
                fatorial *= 1; // preciso de entender o raciocinio
                inicio = inicio + 1;
            }
            System.out.print("O fatorial de " + numeroUser + " é " + fatorial);
        }



        

    }
}
