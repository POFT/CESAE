package FichaPratica03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int inicio = 0, fim;

        //Solicitar ao user um numero inteiro
        System.out.print("Digite um numero: ");
        fim = input.nextInt();

        //Este programa vai imprimir os numeros inteiros desde a variavel "inicio" até ao numero inserido pelo utilizador (variavel "fim").
        while (inicio <= fim){
            System.out.println(inicio);
            inicio = inicio + 1; //outra forma de escrever esta linha é "inicio++"
        }
    }
}
