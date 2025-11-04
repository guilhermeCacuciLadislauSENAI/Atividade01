package VetoresAtv2;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int [10];
        int quantPar = 0, quantImpar = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                quantPar++;
            } else{
                quantImpar++;
            }
        }

        System.out.print("Tem " + quantPar + " números pares e " + quantImpar + " ímpares.");

    }
}
