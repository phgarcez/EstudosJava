
     import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Random;

public class App {
        
        
    public static void main(String[] args)  {
     ArrayList<String> nomes = new ArrayList<>();

        int saida = 0;
        while (saida != 6){
            System.out.println("Digite 1 para Cadastrar novo nome: ");
            System.out.println("Digite 2 para Listar nomes: ");
            System.out.println("Digite 3 para Remover nome: ");
            System.out.println("Digite 6 para Sair. ");

            Scanner entrada = new Scanner(System.in);
            int opc = entrada.nextInt();
            saida = opc;
            //entrada.close();

            if(opc == 1) {

                Scanner nome_entrada = new Scanner(System.in);
                System.out.println("Digite o nome para ser inserido: ");
                String nome = nome_entrada.nextLine();
                System.out.println("Adicionando... ");
                nomes.add(nome);
                //nome_entrada.close();
            }
                

            if(opc == 2){
                System.out.print("Os nomes cadastrados são: ");
                System.out.println(nomes);
            }

            if(opc == 3){
                System.out.println(nomes);                
                Scanner nome_excluir = new Scanner(System.in);
                System.out.println("Digite o nome a ser excluído");
                String nome_excluido = nome_excluir.nextLine();
                nomes.remove(nome_excluido);
               // nome_excluir.close();
            }

        }