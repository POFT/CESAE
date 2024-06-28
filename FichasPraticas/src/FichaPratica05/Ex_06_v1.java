package FichaPratica05;

import java.util.Scanner;

public class Ex_06_v1 {
    public static void main(String[] args) {
        //Ex_06. Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente



        ///ESTA ERRADO



        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] vetor = new int[4];
        boolean crescente=true;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor["+i+"]: ");
            vetor[i] = input.nextInt();
            //Ex.1 vetor [0] = 3
            //Ex.2 vetor [1] = 2
            //Ex.3 vetor [2] = 1
        }
        System.out.println("\n__________________________________\n"); // Linha apenas para separar

        int valor=vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (valor >= vetor[i]) {
                //Ex. inicio SE o valor =0 é >= vetor [0] = 3, passa para o else.
                //Ex. SE o valor = 3 é >= vetor [1] = 2, aqui como é superior é falso (não é crescente)
                crescente = false;
            } else {
                valor = vetor[i];
            }

        }
        if (crescente){ //variavel declarada "Crescente true"
            System.out.println("Crescente");

        }else{ //"Crescente false"
            System.out.println("não é crescente");

        }
    }
}
