import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas = 0.0, media;

        for(int i = 0; i < 3; i++){
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas += sc.nextDouble();
        }
        media = notas / 3;

        System.out.printf("A média das notas é: %.2f%n", media);
        if(media >= 7.0){
            System.out.print("O aluno passou!");
        } else{
            System.out.print("O aluno não passou!");
        }

    }
}
