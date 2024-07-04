import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String palavra;
        int cubo = 4*4;
        System.out.println(cubo);

        try (Scanner entrada = new Scanner(System.in)) {
            palavra = entrada.next();
        }
        System.out.println("Palavra: " + palavra);

    }
}