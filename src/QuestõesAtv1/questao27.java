package QuestõesAtv1;

import java.util.Scanner;

public class Questao27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para N: ");
        int numero = sc.nextInt();

        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {

            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        if (somaDivisores == numero && numero > 0) {
            System.out.print(numero + " é um número perfeito.");
        } else {
            System.out.print(numero + " NÃO é um número perfeito.");
        }

        sc.close();
    }
}
