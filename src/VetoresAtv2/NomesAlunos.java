package VetoresAtv2;

import java.util.Scanner;

public class NomesAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos nomes de alunos você deseja armazenar?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] alunos = new String[n];
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            alunos[i] = sc.nextLine();
        }

        boolean encontrou = false;
        int posicao = 0;
        System.out.println("Qual nome você deseja buscar?");
        String busca = sc.nextLine();
        for(int j = 0; j < alunos.length; j++){
            if(busca.equals(alunos[j])){
                encontrou = true;
                posicao = j;
                break;
            }
        }

        if(encontrou == true){
            System.out.println("Aluno encontrado!");
            System.out.print("Aluno está na posição " + posicao + " do vetor.");
        } else{
            System.out.print("Aluno não encontrado!");
        }

        sc.close();

    }
}
