package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        //  Declarar variaveis
        int valor, notas200, notas100, notas50, notas20, notas10, notas5;

        // Pedir ao user para inserir o valor em euros
        System.out.print("Introduza um valor (múltiplo de 5): ");

        // ler o valor em euros
        valor = input.nextInt();


        //Calcula qual o menor número possível de notas de 200, 100, 50, 20, 10, 5.
        //SE o valor introduzido é superior a 200
        if (valor >= 200) {
            //Calcular a variavel notas200, que corresponde ao valor introduzido dividido por 200
            //Ex. (valor) introduzido é 1100 eur ao dividir por 200 = 5.5 que corresponde a 5 (notas200) e sobra/resto 100 euros
            notas200 = valor / 200;
            System.out.println("Resultado da divisao:" + valor);
            //Ex. o (valor) que sobra/resto e que vai estar na caixa é 100 euros, este é o valor que passa para o if seguinte.
            valor = valor % 200;
            System.out.println("Notas de 200 euros: " + notas200);
        }
        if (valor >= 100) {
            notas100 = valor / 100;
            //System.out.println("Ver resultado da divisao:     " + valor);
            valor = valor % 100;
            //System.out.println("Ver resultado do resto:     " + valor);
            System.out.println("Notas de 100 euros: " + notas100);
        }
        if (valor >= 50) {
            notas50 = valor / 50;
            //System.out.println("Ver resultado da divisao:     " + valor);
            valor = valor % 50;
            //System.out.println("Ver resultado do resto:     " + valor);
            System.out.println("Notas de 50 euros: " + notas50);
        }
        if (valor >= 20) {
            notas20 = valor / 20;
            //System.out.println("Ver resultado da divisao:     " + valor);
            valor = valor % 20;
            //System.out.println("Ver resultado do resto:     " + valor);
            System.out.println("Notas de 20 euros: " + notas20);
        }
        if (valor >= 10) {
            notas10 = valor / 10;
            //System.out.println("Ver resultado da divisao:     " + valor);
            valor = valor % 10;
            //System.out.println("Ver resultado do resto:     " + valor);
            System.out.println("Notas de 10 euros: " + notas10);
        }
        if (valor >= 5) {
            notas5 = valor / 5;
            //System.out.println("Ver resultado da divisao:     " + valor);
            valor = valor % 5;
            //System.out.println("Ver resultado do resto:     " + valor);
            System.out.println("Notas de 5 euros: " + notas5);
        }



    }
}
