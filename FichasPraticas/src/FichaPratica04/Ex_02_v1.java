package FichaPratica04;

import java.util.Scanner;

public class Ex_02_v1 {
    public static void main(String[] args) {

        // Implemente um programa que leia a opção do menu desejada (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
        // Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto com a opção escolhida.
        // Caso a escolha esteja fora das opções válidas, deverá informar o utilizador.
        // De seguida, deverá apresentar novamente o menu para poder selecionar novas opções até que a opção 4 seja escolhida.
        Scanner input = new Scanner(System.in);

        int numeroUser;


        do { //FAZER...
            System.out.println("- Escolha uma opção: "); //Instrução
            System.out.println("1. Criar");  //Instrução 1
            System.out.println("2. Atualizar"); //Instrução 2
            System.out.println("3. Eliminar"); //Instrução 3
            System.out.println("4. Sair"); //Instrução 4
            numeroUser = input.nextInt();
            switch (numeroUser) {
                case 1:
                    System.out.println("Escolheu a opção (Criar).");
                    break;
                case 2:
                    System.out.println("Escolheu a opção (Atualizar).");
                    break;
                case 3:
                    System.out.println("Escolheu a opção (Eliminar).");
                    break;
                case 4:
                    System.out.println("Sair...");
                    break;
                default:
                    System.out.println("Escolheu uma opção inválida!");
            }
        } while (numeroUser != 4);

    }
}
