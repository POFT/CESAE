package FichaPratica03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int numerUser=0, limite, count0_25=0, count26_50=0, count51_75=0, count76_100=0;

        //count1 = total de numeros inseridos pelo utilizador no intervalo de  0 a 25.
        //count2 = total de numeros inseridos pelo utilizador no intervalo de  26 a 50.
        //count3 = total de numeros inseridos pelo utilizador no intervalo de  51 a 75.
        //count4 = total de numeros inseridos pelo utilizador no intervalo de  76 a 100.

        while (numerUser >= 0){
            System.out.println("Introduza um número: ");
            numerUser = input.nextInt();
            if (numerUser >= 0 && numerUser <= 25) {
                count0_25 = count0_25 + 1;
            }
            if (numerUser > 26 && numerUser <= 50) {
                count26_50 = count26_50 + 1;
            }
            if (numerUser > 51 && numerUser <= 75) {
                count51_75 = count51_75 + 1;
            }
            if (numerUser > 76 && numerUser <= 100) {
                count76_100 = count76_100 + 1;
            }
        }
        System.out.println("-[0,25]: " + count0_25);
        System.out.println("-[26,50]: " + count26_50);
        System.out.println("-[51,75]: " + count51_75);
        System.out.println("-[76,100]: " + count76_100);

    }
}
