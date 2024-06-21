package FichaPratica03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        //Declarar variaveis
        int inicio=0, salto, fim;

        //Ler um número inteiro (variavel fim)
        System.out.println("Introduza um limite: ");
        fim = input.nextInt();

        //Ler um incremento (variavel salto)
        System.out.println("Introduza um salto: ");
        salto = input.nextInt();

        //e imprima os números inteiros de 0 até limite inclusive, com incremento de salto.
        while (inicio <= fim){
            System.out.println(inicio);
            inicio = inicio + salto;
        }

        //Exemplo:
        //Valores lidos: 10 (limite) e 3 (salto)
        //Saída do algoritmo: 0 3 6 9

    }
}
