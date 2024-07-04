// import java.util.*;



// public class App {
        
//             public static int busca_menor (ArrayList<Integer> arrlist){
                
//                 int  menor_indice = 0;
//                 int  menor = arrlist.get(0);
                
//                 for (int i = 0; i < arrlist.size(); i++) {
                       
//                         if(arrlist.get(i) < menor){
//                             menor = arrlist.get(i);
//                             menor_indice = i;
//                         }
//                     }     
//                     return menor_indice ;
//                 }

//             public static ArrayList<Integer> ordenacaoPorselecao (ArrayList<Integer> arrlistNaoOrdenado){

//                 ArrayList<Integer> novoArray = new ArrayList<>(arrlistNaoOrdenado.size());  
//                 int indice_do_menor = 0;
//                 int tamanho_array = arrlistNaoOrdenado.size();

//                 for (int i=0; i<tamanho_array; i++) {
//                     indice_do_menor = busca_menor(arrlistNaoOrdenado);
//                     novoArray.add(arrlistNaoOrdenado.get(indice_do_menor));
//                     arrlistNaoOrdenado.remove(indice_do_menor);                      
//                 }
//                 System.out.println("\nEste deveria ser o Array Ordenado: " + novoArray + "\n");
                
//                 return novoArray;      
//               }
        
//     public static void main(String[] args)  {

//         ArrayList<Integer> array1 = new ArrayList<>();
//         array1.add(5);
//         array1.add(3);
//         array1.add(9);
//         array1.add(2);
//         array1.add(11);
//         array1.add(1);
        
//         ordenacaoPorselecao(array1);
     
//         }

//     }