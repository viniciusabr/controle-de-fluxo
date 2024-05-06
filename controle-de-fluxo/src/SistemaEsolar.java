import java.util.Scanner;

public class SistemaEsolar {
    public static void main(String[] args) {
        double nota1, nota2, media;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, insira a primeira nota do aluno:");
            nota1 = scanner.nextDouble();

            System.out.println("Por favor, insira a segunda nota do aluno:");
            nota2 = scanner.nextDouble();        }

        media = (nota1 + nota2)/2;

        if (media == 7)
        System.out.println("Parabéns o aluno foi aprovado na média!");
        else if (media>7 && media<=10) 
        System.out.println("Parabéns você foi aprovado com nota acima da média!");   
        else if (media<7) 
        System.out.println("Infelizmente você ficou reprovado!");
        else
        System.out.println("invalido!");
        


    }
}
