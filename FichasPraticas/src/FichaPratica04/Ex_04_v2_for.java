package FichaPratica04;

import java.util.Scanner;

public class Ex_04_v2_for {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numUser;
        boolean primo=true;

        // Solicitar ao user um numero
        System.out.println("- Introduza um numero: ");
        numUser = input.nextInt(); // gravar input do user
        // SE o resto da divisão por 2 é = 0 o numero não é primo
        // Exemplo1: 10/2 = 5  (10 não é primo)
        // Exemplo2: 11/2 = 5,5  (11 é primo)

        if (numUser <=1){
            primo=false;

        }
        for (int divisor = 2; divisor < numUser; divisor++) {
            if (numUser % divisor == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println(numUser + " é um número primo.");
        }else{
            System.out.println(numUser + " não é um número primo.");
        }
    }
}
