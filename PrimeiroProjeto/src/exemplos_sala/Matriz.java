package exemplos_sala;
import java.util.Scanner;

public class Matriz {
    public static void main (String [] args){
        // criando uma matriz 3x3
        int [][] numeros = new int [3][3];
        Scanner sc = new Scanner(System.in);

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;
        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;

        for(int i = 0; i < numeros.length; i ++){
            for(int j = 0; j < numeros[i].length; j++){
                System.out.println("Digite o valor da linha: ["+ i +"] da coluna: [" + j + "]");
                numeros[i][j] = sc.nextInt();
            }
        }

        for(int k = 0; k < numeros.length; k ++){
            for(int l = 0; l < numeros[k].length; l++){
                System.out.print(numeros[k][l] + " ");
            }
        }

    }
}
