/**
 * Representa um contato do tipo Pessoa Jurídica.
 * Herda os dados básicos da classe {@link ContatoBase} e adiciona o CNPJ como identificador exclusivo.
 */
public class PessoaJuridica extends ContatoBase {

    /** CNPJ da pessoa jurídica (14 dígitos) */
    private String cnpj;

    /**
     * Construtor da classe {@code PessoaJuridica}.
     *
     * @param nome     o nome da empresa
     * @param telefone o número de telefone
     * @param email    o endereço de e-mail
     * @param cnpj     o CNPJ (14 dígitos numéricos)
     */
    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        this.cnpj = cnpj;
    }

    /**
     * Retorna o CNPJ da pessoa jurídica.
     *
     * @return o CNPJ como uma {@code String}
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define um novo CNPJ para a pessoa jurídica.
     *
     * @param cnpj o novo CNPJ (14 dígitos)
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Retorna uma representação textual da pessoa jurídica.
     *
     * @return uma {@code String} com nome, telefone, e-mail e CNPJ
     */
    @Override
    public String toString() {
        return "Pessoa Jurídica:\n" +
                "Nome: " + getNome() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "CNPJ: " + cnpj;
    }
}
