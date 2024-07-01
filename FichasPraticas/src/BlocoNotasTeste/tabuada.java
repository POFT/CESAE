package BlocoNotasTeste;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        //EXEMPLO_TABUADA
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
