package FichaPratica02;

import java.util.Scanner;

public class Ex_01_repeat {
    public static void main(String[] args) {

        // Import Scanner-  uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2;

        // ler numero 1
        System.out.print("Introduza um numero:");
        num1 = input.nextInt();

        // ler numero 2
        System.out.print("Introduza um numero:");
        num2 =  input.nextInt();

        // Avaliar qual dos numeros é maior (if = SE)(else = ENTÃO)
        if (num1 > num2) {
            System.out.println("Maior:"+ num1);
        }else{
            System.out.println("Maior:"+ num2);

    }
    }
}
