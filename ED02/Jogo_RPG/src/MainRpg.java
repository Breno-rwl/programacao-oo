/**
 * Classe que executa o jogo de RPG.
 */
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        System.out.println("Status inicial:");
        g.status();
        m.status();
        a.status();

        System.out.println("\nCombate:");
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        System.out.println("\nStatus final:");
        g.status();
        m.status();
        a.status();
    }
}

