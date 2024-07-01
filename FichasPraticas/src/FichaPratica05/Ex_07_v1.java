package FichaPratica05;

import java.util.Scanner;

public class Ex_07_v1 {
    public static void main(String[] args) {

        // Ex_07. Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par inserido.
        // Caso não exista, deverá informar o utilizador

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorPar;

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no Vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maiorPar = 1;

        for (int i = 0; i < vetor.length; i++) {

            if(vetor[i]%2==0){ // Se o meu numero atual for par

                if(maiorPar%2!=0){
                    maiorPar=vetor[i];
                }else{

                    if(vetor[i]>maiorPar){
                        maiorPar=vetor[i];
                    }

                }

            }

        }

        if(maiorPar%2!=0){
            System.out.println("Sem pares");
        }else{
            System.out.println("Maior Par: " + maiorPar);
        }
    }
}