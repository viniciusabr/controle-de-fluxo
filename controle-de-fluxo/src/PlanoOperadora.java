import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
        System.out.println("Digite um plano:");
        String plano = scanner.nextLine();

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
                System.out.println("whats e Instragram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }

       }
    }
}
