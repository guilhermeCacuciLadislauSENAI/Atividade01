package exemplos_sala;

public class Vetor {
    public static void main (String [] args){

        // criando um vetor com números inteiros
        int [] numeros = new int [5];

        // passando valores para o vetor
        numeros [0] = 10;
        numeros [1] = 20;
        numeros [2] = 30;
        numeros [3] = 40;
        numeros [4] = 50;

        // exibição dos valores
        System.out.println("\nValores do vetor: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posição " + (i + 1) + ":" + numeros[i]);
        }

    }
}
