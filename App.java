import java.util.*;



public class App {
        

        
    public static void main(String[] args)  {
        int aux;
        int[] array;
        array = new int[5];
        int numero;

        for(int a=0; a<=4; a++){
            System.out.print("Digite o número: ");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();
            array[a] = numero;
        }
        
        for(int i=1; i<=5; i++){
            for(int j=0; j<4; j++){
                if(array[j] > array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        // 0 1 2 3 4

        for(int t=0; t<=4; t++)
         System.out.print(array[t]+ ", ");
      
       
        }

    }