import java.util.Scanner;
public class questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade > 0 && idade < 12){
            System.out.print("Você é uma criança.");
        } else if (idade > 11 && idade < 18){
            System.out.print("Você é um adolescente.");
        } else if (idade > 17 && idade < 60){
            System.out.print("Você é um adulto.");
        }else if (idade > 59) {
            System.out.print("Você é um idoso.");
        }else{
            System.out.print("Idade inválida.");
        }
        sc.close();
    }
}
