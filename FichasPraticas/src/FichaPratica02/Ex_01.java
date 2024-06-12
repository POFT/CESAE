package FichaPratica02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int number1, number2;

        // ler numero 1
        System.out.print("Digite um numero: ");
        number1 = input.nextInt();

        // ler numero 2
        System.out.print("Digite um numero: ");
        number2 = input.nextInt();

        // Avaliar qual dos numeros é maior
        if (number1>number2){
            System.out.println("Maior: " + number1);
        }else{
            System.out.println("Maior: " + number2);
        }
    }
}
