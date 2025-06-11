import java.util.List;

/**
 * Classe responsável por exibir informações para o usuário.
 * Apresenta o menu e mostra a lista de contatos cadastrados.
 */
public class ContatoView {

    /**
     * Exibe o menu principal com as opções disponíveis ao usuário.
     */
    public void exibirMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Listar Contatos");
        System.out.println("3. Remover Contato");
        System.out.println("4. Sair");
    }

    /**
     * Exibe todos os contatos cadastrados em formato de tabela.
     * Caso a lista esteja vazia, informa que não há contatos.
     *
     * @param contatos lista de contatos (Pessoa Física ou Jurídica)
     */
    public void mostrarContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
            return;
        }

        System.out.printf("\n%-20s %-15s %-25s %-20s\n", "Nome", "Telefone", "Email", "Documento");
        System.out.println("-------------------------------------------------------------------------------");

        for (Contato c : contatos) {
            String doc;

            if (c instanceof PessoaFisica) {
                doc = ((PessoaFisica) c).getCpf();
            } else if (c instanceof PessoaJuridica) {
                doc = ((PessoaJuridica) c).getCnpj();
            } else {
                doc = "N/A";
            }

            System.out.printf("%-20s %-15s %-25s %-20s\n",
                    c.getNome(),
                    c.getTelefone(),
                    c.getEmail(),
                    doc);
        }
    }
}
