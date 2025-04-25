import java.util.ArrayList;

public class Placar {
    private ArrayList<Jogador> ranking;

    public Placar() {
        ranking = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        ranking.add(jogador);
    }

    public void mostrarRanking() {
        System.out.println("\nRANKING DE JOGADORES:");
        for (Jogador j : ranking) {
            System.out.println(j.getNome() + " - Pontuação: " + j.getPontuacao());
        }
    }
}