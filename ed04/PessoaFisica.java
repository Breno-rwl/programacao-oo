/**
 * Representa um contato do tipo Pessoa Física.
 * Herda os dados básicos da classe {@link ContatoBase} e adiciona o CPF como identificador exclusivo.
 */
public class PessoaFisica extends ContatoBase {

    /** CPF da pessoa física (11 dígitos) */
    private String cpf;

    /**
     * Construtor da classe {@code PessoaFisica}.
     *
     * @param nome     o nome da pessoa
     * @param telefone o número de telefone
     * @param email    o endereço de e-mail
     * @param cpf      o CPF (11 dígitos numéricos)
     */
    public PessoaFisica(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email);
        this.cpf = cpf;
    }

    /**
     * Retorna o CPF da pessoa física.
     *
     * @return o CPF como uma {@code String}
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define um novo CPF para a pessoa física.
     *
     * @param cpf o novo CPF (11 dígitos)
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Retorna uma representação textual da pessoa física.
     *
     * @return uma {@code String} com nome, telefone, e-mail e CPF
     */
    @Override
    public String toString() {
        return "Pessoa Física:\n" +
                "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "CPF: " + cpf;
    }
}
