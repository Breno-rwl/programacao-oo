import java.util.Random;

/**
 * Classe que um arqueiro com ataques à distância.
 */
public class Arqueiro extends Personagem {
    private Random rand = new Random();

    /**
     * Construtor do Arqueiro.
     *
     * @param nome Nome do arqueiro.
     */
    public Arqueiro(String nome) {
        super(nome, 120, 25);
    }

    /**
     * Ataca com chance de acertar crítico.
     *
     * @param inimigo Inimigo a ser atacado.
     */
    @Override
    public void atacar(Personagem inimigo) {
        int dano = ataqueBase;
        boolean critico = rand.nextInt(100) < 20; // 20% de chance

        if (critico) {
            dano *= 2;
            System.out.println(nome + " acerta um ataque crítico!");
        }

        System.out.println(nome + " dispara flecha em " + inimigo.nome + " causando " + dano + " de dano.");
        inimigo.defender(dano);
    }

    /**
     * Usa a habilidade "Chuva de Flechas", realizando 3 ataques consecutivos.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        for (int i = 1; i <= 3; i++) {
            int dano = ataqueBase;
            System.out.println("Flecha " + i + ": " + dano + " de dano.");
        }
    }
}

