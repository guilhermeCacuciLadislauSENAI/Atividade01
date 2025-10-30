package exemplos_sala;
import java.util.Scanner;

public class VetorUsuario {
    public static void main (String [] args){
        // criando o scanner
        Scanner sc = new Scanner (System.in);
        double [] notas = new double [3];

        // entrada dos valores
        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
        }

        // cálculo da média
        double soma = 0;
        for(double n : notas){
            soma += n;
        }

        // declarando e atribuíndo a média das notas para a sua devida variável
        double media = soma / notas.length;

        // imprimindo na tela uma mensagem junto com a média
        System.out.println("A médias das notas é: " + media);
        sc.close();

    }
}
