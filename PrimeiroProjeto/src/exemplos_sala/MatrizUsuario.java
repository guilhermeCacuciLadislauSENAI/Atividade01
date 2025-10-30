package exemplos_sala;
import java.util.Scanner;

public class MatrizUsuario {
    public static void main (String [] args){
        // declarando o scanner
        Scanner sc = new Scanner(System.in);

        //declarando a matriz 2x2
        int[][] numeros = new int[2][2];

        //entrada de dados na matriz
        for(int i = 0; i < numeros.length; i ++){
            for(int j = 0; j < numeros[i].length; j++){
                System.out.println("Digite o valor da linha: ["+ i +"] da coluna: [" + j + "]");
                numeros[i][j] = sc.nextInt();
            }
        }

        // exibição
        System.out.println("Matriz digitada:");
        for(int k = 0; k < numeros.length; k++){
            for(int l = 0; l <numeros[k].length; l++){
                System.out.print(numeros[k][l] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
