package FichaPratica03;

public class Ex_02_v1 {
    public static void main(String[] args) {

        //Imprimir os números pares no intervalo de 1 a 400 inclusive.
        ////SE o resto(%) do valor a dividir por 2 é igual a 0 então é par.
        // (Não necessita de Scanner ou input do utilizador).

        int numero = 0;

        while (numero <= 400) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero = numero + 1;


        }
    }
}
