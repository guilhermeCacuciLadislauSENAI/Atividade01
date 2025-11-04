package VetoresAtv2;

import java.util.Scanner;

public class MaiorMenorSolicitado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int menor = numeros[0];
        int maior = numeros[0];

        for(int i = 0; i < numeros.length; i ++){
            if(menor > numeros[i]){
                menor = numeros[i];
            }

            if(maior < numeros[i]){
                maior = numeros[i];
            }
        }

        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}
