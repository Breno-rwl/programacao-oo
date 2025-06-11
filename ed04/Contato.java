/**
 * Interface que representa um contato genérico.
 * Define os métodos básicos que todo contato deve implementar:
 * nome, telefone e e-mail.
 */
public interface Contato {

    /**
     * Retorna o nome do contato.
     *
     * @return o nome do contato como uma {@code String}
     */
    String getNome();

    /**
     * Retorna o número de telefone do contato.
     *
     * @return o telefone do contato como uma {@code String}
     */
    String getTelefone();

    /**
     * Retorna o endereço de e-mail do contato.
     *
     * @return o e-mail do contato como uma {@code String}
     */
    String getEmail();
}
