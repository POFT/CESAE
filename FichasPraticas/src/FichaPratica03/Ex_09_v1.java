package FichaPratica03;

import java.util.Scanner;

public class Ex_09_v1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int numeroUser = 0, somaValor = 1, count = -1, media= 0;


        while (numeroUser != -1){

            System.out.println("Introduza um número:");
            numeroUser = input.nextInt();

            somaValor = somaValor + numeroUser;
            count = count + 1;

        }
        media = somaValor / count;
        System.out.println("Média: " + media);

    }
}