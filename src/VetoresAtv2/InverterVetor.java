package VetoresAtv2;

import java.util.Scanner;

public class InverterVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja colocar no vetor?");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int[] numerosInvertido = new int[n];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número(posição " + i + "): ");
            numeros[i] = sc.nextInt();
            numerosInvertido[n - 1 - i] = numeros[i];
        }

        System.out.println("=== Vetor invertido ===");
        for(int j = 0; j < numerosInvertido.length; j++){
            System.out.println("Posição " + j + ": " + numerosInvertido[j]);
        }

        sc.close();
    }
}
