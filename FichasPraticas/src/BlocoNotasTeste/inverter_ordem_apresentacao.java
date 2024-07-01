package BlocoNotasTeste;

import java.util.Scanner;

public class inverter_ordem_apresentacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
