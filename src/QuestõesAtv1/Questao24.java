package QuestõesAtv1;

import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para N: ");
        int numero = sc.nextInt();

        System.out.println("\n=== CONTAGEM REGRESSIVA ===");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
