package QuestõesAtv1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;

        System.out.print("Escreva o número: ");
        n1 = sc.nextInt();

        if (n1 % 2 == 0){
            System.out.print("Número par.");
        } else {
            System.out.print("Número ímpar.");
        }
        sc.close();
    }
}
