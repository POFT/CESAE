package FichaPratica02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int a, b, c;
        String operacao;

        System.out.print("Insira um número (1 a 10):");
        a = input.nextInt();
        System.out.print("Insira outro número (1 a 10):");
        b = input.nextInt();
        System.out.print("Insira outro número (1 a 10):");
        c = input.nextInt();


        System.out.println("Introduza (C) para ordem crescende ou (D) para Decrescente:");
        operacao = input.next();
        //SE a < b && a < c
        //SE b < a
        // && b < c
        //SE c < a && c < b

switch (operacao){
    case "C":
        if (a < b && a < c) {
            if (b < c) {
                System.out.print(a + "\t" + b + "\t" + c);
            } else {
                System.out.print(a + "\t" + c + "\t" + b);
            }
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.print(b + "\t" + a + "\t" + c);
            } else {
                System.out.print(b + "\t" + c + "\t" + a);
            }
        }
        if (c < a && c < b) {
            if (b < a) {
                System.out.print(c + "\t" + b + "\t" + a);
            } else {
                System.out.print(c + "\t" + a + "\t" + b);
            }
        }
        break;

        // Decrescente
    case "D":
        if (a < b && a < c) {
            if (b < c) {
                System.out.print(c + "\t" + b + "\t" + a);
            } else {
                System.out.print(b + "\t" + c + "\t" + a);
            }
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.print(c + "\t" + a + "\t" + b);
            } else {
                System.out.print(a + "\t" + c + "\t" + b);
            }
        }
        if (c < a && c < b) {
            if (b < a) {
                System.out.print(a + "\t" + b + "\t" + c);
            } else {
                System.out.print(b + "\t" + a + "\t" + c);
            }
        }
        break;



    }
    }
}
