package QuestõesAtv1;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura, conversao;
        char tpTemp;
        System.out.print("Você deseja digitar em C(Celsius) ou F(Fahrenheit)? ");
        tpTemp = sc.next().toUpperCase().charAt(0);

        if (tpTemp == 'C'){
            System.out.print("Digite a temperatura: ");
            temperatura = sc.nextDouble();
            conversao = (temperatura * 9/5) + 32;
            System.out.print("A temperatura em Fahrenheit é: " + conversao);
        }else if (tpTemp == 'F') {
            System.out.print("Digite a temperatura: ");
            temperatura = sc.nextDouble();
            conversao = (temperatura - 32) * 5 / 9;
            System.out.print("A temperatura em Celsius é: " + conversao);
        }else{
            System.out.print("Tipo inválido.");
        }
        sc.close();
    }

}
