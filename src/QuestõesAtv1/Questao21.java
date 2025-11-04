import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, potencia, total = 1;
        System.out.print("Digite um número: ");
        numero = sc.nextInt();
        System.out.print("Agora digite a potência: ");
        potencia = sc.nextInt();

        for(int i =0; i < potencia; i++){

            total *= numero;

        }

        System.out.print(numero + "^" + potencia + " = " + total);
        sc.close();
    }
}
