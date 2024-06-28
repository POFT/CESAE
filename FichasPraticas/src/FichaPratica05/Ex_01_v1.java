package FichaPratica05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_01_v1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int[] vetor = new int[10];

        //ler valor
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira no Vetor["+i+"]: ");
            vetor[i] = input.nextInt();

        }
    }
}
