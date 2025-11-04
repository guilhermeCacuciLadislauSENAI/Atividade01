package QuestõesAtv1;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, par = 0, impar = 0;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        for(int i = 1; i <= numero; i++){
            if(i % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }

        System.out.print("De 1 até " + numero +" possui " + par + " números pares e " + impar + " números ímpares.");
    }
}
