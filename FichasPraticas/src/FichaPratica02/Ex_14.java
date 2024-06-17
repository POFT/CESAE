package FichaPratica02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia 3 números
        int a, b, c;

        System.out.print("Insira um número (1 a 10):");
        a = input.nextInt();
        System.out.print("Insira outro número (1 a 10):");
        b = input.nextInt();
        System.out.print("Insira outro número (1 a 10):");
        c = input.nextInt();

        //seguidamente deve colocar os números no ecrã por ordem crescente.
        //SE a > b && a > c
        //SE b > a && b > c
        //SE c > a && c > b

        //SE a < b && a < c
        //SE b < a && b < c
        //SE c < a && c < b

        //num1 < num2 && num1 < num3 (num1 é o mais pequeno) //num2 > num1 && num2 < num3
        if (a < b && a < c){
            if (b < c)
            System.out.print( a + "\t"+ b + "\t" + c);
        }else{
            System.out.print( a + "\t"+ c + "\t" + b);
        }

    }
}
