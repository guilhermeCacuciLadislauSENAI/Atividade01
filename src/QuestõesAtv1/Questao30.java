package QuestõesAtv1;

import java.util.Scanner;

public class Questao30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, numero3;

        System.out.println("Vamos descobrir o maior e o menor entre 3 números!");
        System.out.print("Digite três números separados por espaço: ");

        numero1 = sc.nextDouble();
        numero2 = sc.nextDouble();
        numero3 = sc.nextDouble();

        if (numero1 == numero2 && numero1 == numero3) {
            System.out.print("Os números são iguais!");
        } else {

            double maior = numero1;

            if (numero2 > maior) {
                maior = numero2;
            }
            if (numero3 > maior) {
                maior = numero3;
            }

            double menor = numero1;

            if (numero2 < menor) {
                menor = numero2;
            }
            if (numero3 < menor) {
                menor = numero3;
            }

            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }

        sc.close();
    }
}