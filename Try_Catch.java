import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Random;

public class App {
        
        
    public static void main(String[] args)  {

            //Pedido p = new Pedido();
            
            try{
                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite um número: ");
                int num = entrada.nextInt();
                System.out.println("O número digitao foi: " + num);
            } catch (Exception er){
                System.out.println("\nEntrada invalida ! \nÉ necessário digitat um número válido. \n");
               
            }

        }

    }