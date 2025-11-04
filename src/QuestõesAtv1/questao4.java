package QuestõesAtv1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // questão 4
        int n1, n2, subtracao, multiplicacao, divisao;

        System.out.print("Escreva o  primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Escreva o  segundo número: ");
        n2 = sc.nextInt();
        subtracao = n1 - n2;
        System.out.print("O resultado da subtração é: " + subtracao);
        multiplicacao = n1 * n2;
        System.out.print("O resultado da multiplicação é: " + multiplicacao);
        divisao = n1 / n2;
        System.out.print("O resultado da divisão é: " + divisao);
        sc.close();
    }
}
