import java.util.*;



public class App {
        
            public static int recursao(int num){
                if (num < 2){
                    return num;
                }
                return recursao(num - 1) + recursao(num -2);
            }
        
    public static void main(String[] args)  {
           
        int a;

            for(int i=0; i<10; i++){

               a = recursao(i);
               System.out.print(a + " ");
            }
     
        }

    }