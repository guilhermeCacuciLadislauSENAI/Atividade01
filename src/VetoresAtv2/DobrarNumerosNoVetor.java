package VetoresAtv2;

import java.util.Scanner;

public class DobrarNumerosNoVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja colocar no vetor?");
        int n = sc.nextInt();

        int [] numeros = new int [n];
        int [] numerosDobrados = new int [n];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();
            numerosDobrados[i] = numeros[i] * 2;
        }

        for(int j = 0; j < numeros.length; j++){

            System.out.print("Vetor original, número na posição " + j + ": " + " || ");
            System.out.println("Vetor modificado com números dobrados, número na posição " + j + ": ");
            System.out.print(numeros[j] + " || ");
            System.out.println(numerosDobrados[j]);

        }

        sc.close();

    }
}
