package BlocoNotasTeste;

import java.util.Scanner;

public class divisores_num_user {
    public static void main(String[] args) {
        //Este programa imprime todos os divisores de um número dado pelo utilizador.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Insira um número inteiro positivo: ");
        int num= scanner.nextInt();

        System.out.println("Os divisores de "+ num + "são: ");

        for(int i=0; i<num; i++){
            for(int h=1; h<2; h++){
                if(num%i == 0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
