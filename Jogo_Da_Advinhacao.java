import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args)  {
        Random randomico = new Random();
        int a = randomico.nextInt(2);

        Scanner x = new Scanner(System.in);
        System.out.println("Adivinho o número que estou pensando...");
        int num_digitado = x.nextInt();
        System.out.println(a + ", "  +num_digitado);

        if(a == num_digitado){
            System.out.println("Parabéns vc acertou !");
        } else{
            System.out.println("Que pena, vc não acertou !");
        }
        x.close();
    }
}
