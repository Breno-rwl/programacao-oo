import java.util.*;

/**
 * Classe responsável por gerenciar os contatos da agenda.
 * Permite adicionar, remover e listar contatos, garantindo que não haja duplicidade
 * com base no identificador único (CPF ou CNPJ).
 */
public class ContatoController {

    /** Lista que armazena todos os contatos cadastrados */
    private List<Contato> contatos = new ArrayList<>();

    /**
     * Adiciona um novo contato à lista, verificando se já existe pelo identificador.
     *
     * @param contato o contato a ser adicionado (Pessoa Física ou Jurídica)
     */
    public void adicionar(Contato contato) {
        String id = getIdentificador(contato);
        for (Contato c : contatos) {
            if (getIdentificador(c).equals(id)) {
                System.out.println("Contato já existe.");
                return;
            }
        }
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso.");
    }

    /**
     * Remove um contato da lista com base no CPF ou CNPJ.
     *
     * @param identificador o CPF (11 dígitos) ou CNPJ (14 dígitos) do contato
     */
    public void remover(String identificador) {
        boolean removido = contatos.removeIf(c -> getIdentificador(c).equals(identificador));
        System.out.println(removido ? "Removido com sucesso." : "Contato não encontrado.");
    }

    /**
     * Retorna todos os contatos cadastrados.
     *
     * @return uma lista de contatos
     */
    public List<Contato> listar() {
        return contatos;
    }

    /**
     * Retorna o identificador único do contato (CPF para PF ou CNPJ para PJ).
     *
     * @param c o contato cuja identificação será retornada
     * @return o CPF ou CNPJ do contato, ou string vazia se indefinido
     */
    private String getIdentificador(Contato c) {
        if (c instanceof PessoaFisica) return ((PessoaFisica) c).getCpf();
        if (c instanceof PessoaJuridica) return ((PessoaJuridica) c).getCnpj();
        return "";
    }
}
