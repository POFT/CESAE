package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int numerUser=0, limite, count1=0, count2=0, count3=0, count4=0;

        //count1 = total de numeros inseridos pelo utilizador no intervalo de  0 a 25.
        //count2 = total de numeros inseridos pelo utilizador no intervalo de  26 a 50.
        //count3 = total de numeros inseridos pelo utilizador no intervalo de  51 a 75.
        //count4 = total de numeros inseridos pelo utilizador no intervalo de  76 a 100.

        while (numerUser >= 0){
            System.out.println("Introduza um número: ");
            numerUser = input.nextInt();
            if (numerUser > 0 && numerUser <= 25) {
                count1 = count1 + 1;
            }
            if (numerUser > 26 && numerUser <= 50) {
                count2 = count2 + 1;
            }
            if (numerUser > 51 && numerUser <= 75) {
                count3 = count3 + 1;
            }
            if (numerUser > 76 && numerUser <= 100) {
                count4 = count4 + 1;
            }
        }
        System.out.println("-[0.25]: " + count1);
        System.out.println("-[26,50]: " + count2);
        System.out.println("-[51,75]: " + count3);
        System.out.println("-[76,100]: " + count4);





    }
}
