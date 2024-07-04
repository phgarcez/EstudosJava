public class Brasilierao {

    public static class Equipe{
        public Jogador jogador;
        public String nome;
        public String estado;
        public int posicao;

        public Equipe (Jogador jogador, String nome, String estado, int posicao){
            this.jogador = jogador;
            this.nome = nome;
            this.estado = estado;
            this.posicao = posicao;
        }

    }
    public static class Jogador{
        public String nome;
        public String posicao;
        public int idade;
        
        public Jogador(String nome, String posicao, int idade){
            this.nome = nome;
            this.posicao = posicao;
            this.idade = idade;
        }
    }
    public static void main(String[] args)  {

        Jogador Hulk = new Jogador("Givanildo", "Atacante", 37);
        Jogador Arana = new Jogador("Guilherme", "Lateral esquerdo", 23);
        Equipe Atletico = new Equipe(Hulk, "Atletico", "Mg", 1);
        Atletico.jogador = Arana;
        System.out.println(Atletico.jogador.nome);

    }
    
}
