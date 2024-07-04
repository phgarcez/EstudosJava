package partes;

public class Brasileirao {

    public static void main (String[] Args){
        Jogador Hulk = new Jogador("Everson", "Goleiro", 34);
        
        Equipe Atletico = new Equipe(Hulk, "Atlético", "Mg", 1);
    
        System.out.println(Atletico.jogador.nome);

    }
    
}
