//import java.util.Scanner;
//import java.util.Random;

public class App {
        public static int buscaBinaria (int[] lista, int item){
            int baixo = 0;
            int alto = lista.length - 1;

            while(baixo <= alto){
                int meio = (baixo + alto) / 2;
                int chute = lista[meio];

                if(chute == item){
                    return meio;
                }
                if(chute > item){
                    alto = meio - 1;
                }
                else {
                    baixo = meio +1;
                }
            }
           return -1;
        }
    public static void main(String[] args)  {
       
        int[] minha_lista;
        minha_lista = new int[6];
        minha_lista[0] = 1;
        minha_lista[1] = 3;
        minha_lista[2] = 5;
        minha_lista[3] = 7;
        minha_lista[4] = 9;
        minha_lista[5] = 10;
        
        int total = App.buscaBinaria(minha_lista, 150);

        if (total != -1)
        System.out.println("O valor está na posição: "+ total);
        else{
            System.out.println("O valor não existe na lista !");
        }
        //System.out.println(total);
    }
}

