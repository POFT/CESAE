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


        do {
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            numeroUser = input.nextInt();
            switch (numeroUser) {
                case 1:
                    System.out.println("Escolheu a opção 1. Criar");
                    break;
                case 2:
                    System.out.println("Escolheu a opção 2. Atualizar");
                    break;
                case 3:
                    System.out.println("Escolheu a opção 3. Eliminar");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (numeroUser != 4);

    }
}
