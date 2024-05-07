import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla;

        try (Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Digite uma sigla:");
            sigla = scanner.nextLine();}

        if (sigla.equals("M") || sigla.equals("m")) {
            System.out.println("Médio");
        }else if(sigla.equals("P") || sigla.equals("p")){
            System.out.println("Pequeno");
        }else if(sigla.equals("G") || sigla.equals("g")){
            System.out.println("Grande");
        }else {
            System.out.println("Invalido!");
        }
            
        
        
    }
}
