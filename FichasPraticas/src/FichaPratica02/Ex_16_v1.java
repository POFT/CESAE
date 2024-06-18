package FichaPratica02;

import java.util.Scanner;

public class Ex_16_v1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        //Declarar variaveis
        int valor, ultimoDigito;

        // Pedir ao user para introduzir o valor múltiplo de 5
        System.out.print("Introduza um valor (múltiplo de 5): ");
        // ler o valor em euros
        valor= input.nextInt();

        //Validar o ultimo digito do numero
        ultimoDigito = valor % 5;
        System.out.println("O valor do ultimo digito: " + ultimoDigito);

        //Se o valor do ultimo digito é diferente de 0 ou 5 significa que não é multiplo de 5
        if (ultimoDigito == 0 || ultimoDigito == 5) {
            System.out.println("O último dígito do número é válido (0 ou 5).");
        } else {
            System.out.println("ERRO não introduziu um valor multiplo de 5.");
        }


        }
    }
