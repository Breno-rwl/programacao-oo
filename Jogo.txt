import java.util.Random;

public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1; 
    }

    public String jogar(int tentativa) {
        jogador.incrementarTentativas();

        if (tentativa < numeroSecreto) {
            return " O número secreto é maior.";
        } else if (tentativa > numeroSecreto) {
            return " O número secreto é menor.";
        } else {
            jogador.atualizarPontuacao(); 
            return " Acertou!";
        }
    }
}