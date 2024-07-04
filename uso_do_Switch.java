import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar notas");
       
        int numero = entrada.nextInt();

        switch (numero){
            case 1: 
                System.out.println("Cadastrando Aluno");
                break;
            case 2:
                System.out.println("Cadastrando notas");
                break;
            default:
                System.out.println("Número inválido");
        }
        entrada.close(); // Para não gerar o erro de Leak variável não é fechada, após abrir com Scanner fechar a mesma com .close()

    }
}