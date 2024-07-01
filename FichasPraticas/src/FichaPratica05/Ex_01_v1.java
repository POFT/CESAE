package FichaPratica05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_01_v1 {
    public static void main(String[] args) {
    // Ex_01.  Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem de inserção
        Scanner input = new Scanner(System.in);

        //Declarar variaveis, vetor/array e numero de input's inteiro a considerar
        int[] array = new int[10];

        //Ler valor/input user
        for (int i = 0; i < array.length; i++) { //"array.lenght" corresponde ao valor definido na variavel "new int[10]"
            System.out.println("- Insira um número no Array["+i+"]: ");
            array[i] = input.nextInt();

        }
        System.out.println("\n___________________________________________\n");

        // Imprimir (input do user) array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }
}
