import java.util.Scanner;
import java.util.Random;
public class questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int numero, numeroSorteado;

        numeroSorteado = gerador.nextInt(100) + 1;

        for(int i = 0; i < 100; i++){
            System.out.print("Digite um número para tentar advinhar: ");
            numero = sc.nextInt();

            if(numero == numeroSorteado){
                System.out.print("Parabéns, você acertou!");
                break;
            }else{
                System.out.println("Você errou, tente novamente!");
                if(numeroSorteado > numero){
                    System.out.println("O número sorteado é maior!");
                }else{
                    System.out.println("O número sorteado é menor!");
                }
            }

        }
        sc.close();
    }
}
