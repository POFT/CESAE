package FichaPratica03;

public class Ex_07_v1 {
    public static void main(String[] args) {

        //Faça um programa que imprima os números inteiros de 1 a 100 inclusive.
        //Imprima a soma dos valor imprimidos.
        //resultado 15

        int numeros = 1, soma = 0;

        while (numeros <= 3){
            System.out.println(numeros);
            soma = soma + numeros;
            numeros = numeros + 1;
        }
        numeros = numeros - 1;
        System.out.println("numeros" + numeros);

        System.out.println("Somatorio: " + soma);


    }
}