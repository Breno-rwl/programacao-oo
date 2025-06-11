/**
 * Classe abstrata que implementa a interface {@link Contato} e fornece
 * uma base comum para contatos, armazenando nome, telefone e e-mail.
 *
 * Essa classe deve ser estendida por classes concretas como {@code PessoaFisica}
 * ou {@code PessoaJuridica}, que fornecem identificadores adicionais (CPF ou CNPJ).
 */
public abstract class ContatoBase implements Contato {

    /** Nome do contato */
    private String nome;

    /** Telefone do contato */
    private String telefone;

    /** E-mail do contato */
    private String email;

    /**
     * Construtor da classe base para um contato.
     *
     * @param nome     o nome do contato
     * @param telefone o número de telefone do contato
     * @param email    o endereço de e-mail do contato
     */
    public ContatoBase(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * {@inheritDoc}
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do contato.
     *
     * @param nome o novo nome do contato
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * {@inheritDoc}
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do contato.
     *
     * @param telefone o novo telefone do contato
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * {@inheritDoc}
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o e-mail do contato.
     *
     * @param email o novo e-mail do contato
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
