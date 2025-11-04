package QuestõesAtv1;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2){
            System.out.print("O primeiro número digitado é maior.");
        } else if (n1 < n2){
            System.out.print("O segundo número digitado é maior.");
        } else {
            System.out.print("Os números são iguais.");
        }
        sc.close();
    }
}
