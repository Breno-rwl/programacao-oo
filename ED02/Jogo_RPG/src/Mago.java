/**
 * Classe que representa um mago com ataques  poderosos.
 */
public class Mago extends Personagem {

    /**
     * Estrutura do Mago.
     *
     * @param nome Nome do mago.
     */
    public Mago(String nome) {
        super(nome, 100, 40);
    }

    /**
     * Defesa fraca, recebe o dano completo.
     *
     * @param dano Dano recebido.
     */
    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " tem defesa fraca e recebeu " + dano + " de dano.");
        if (hp < 0) hp = 0;
    }

    /**
     * Usa a habilidade "Bola de Fogo", um ataque mágico.
     */
    @Override
    public void usarHabilidadeEspecial() {
        int dano = ataqueBase + 20;
        System.out.println(nome + " lança Bola de Fogo! Dano em área: " + dano);
    }
}

