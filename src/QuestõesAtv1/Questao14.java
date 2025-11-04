package QuestõesAtv1;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        // Verifica se é bissexto
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("O ano " + ano + " é bissexto!");
        } else {
            System.out.println("O ano " + ano + " não é bissexto!");
        }

        sc.close();
    }
}
