public class Jogador {
    private String nome;
    private int tentativas;
    private int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getTentativas() {
        return tentativas;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void incrementarTentativas() {
        tentativas++;
    }

    public void atualizarPontuacao() {
        pontuacao = Math.max(0, 100 - (tentativas * 10)); 
    }
}