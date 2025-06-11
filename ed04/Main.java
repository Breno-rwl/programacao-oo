import java.util.*;

/**
 * Classe principal responsável por executar o sistema de Agenda de Contatos.
 * Gerencia o menu interativo e a comunicação entre o usuário, a visualização (View)
 * e o controlador (Controller).
 */
public class Main {
    /**
     * Método principal que inicia o sistema de Agenda de Contatos.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContatoController controller = new ContatoController(); // Corrigido nome da variável
        ContatoView view = new ContatoView();

        // Loop principal do menu
        while (true) {
            view.exibirMenu(); // Exibe o menu de opções
            System.out.print("Escolha uma opção: ");
            String input = sc.nextLine();

            // Valida entrada de opção (somente números de 1 a 4 são aceitos)
            if (!input.matches("[1-4]")) {
                System.out.println("Erro: Opção inválida.");
                continue;
            }

            int opcao = Integer.parseInt(input);
            switch (opcao) {
                case 1:
                    // Cadastro de novo contato
                    System.out.print("Tipo (1 - PF, 2 - PJ): ");
                    String tipoInput = sc.nextLine();
                    if (!tipoInput.matches("[1-2]")) {
                        System.out.println("Tipo inválido.");
                        break;
                    }
                    int tipo = Integer.parseInt(tipoInput);

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("Nome deve ter no mínimo 3 caracteres.");
                        break;
                    }

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    if (tipo == 1) {
                        // Cadastro de Pessoa Física
                        System.out.print("CPF (11 dígitos): ");
                        String cpf = sc.nextLine();
                        if (!cpf.matches("\\d{11}")) {
                            System.out.println("CPF inválido.");
                            break;
                        }
                        controller.adicionar(new PessoaFisica(nome, telefone, email, cpf));
                    } else {
                        // Cadastro de Pessoa Jurídica
                        System.out.print("CNPJ (14 dígitos): ");
                        String cnpj = sc.nextLine();
                        if (!cnpj.matches("\\d{14}")) {
                            System.out.println("CNPJ inválido.");
                            break;
                        }
                        controller.adicionar(new PessoaJuridica(nome, telefone, email, cnpj));
                    }
                    break;

                case 2:
                    // Listagem de contatos
                    view.mostrarContatos(controller.listar());
                    break;

                case 3:
                    // Remoção de contato pelo CPF ou CNPJ
                    System.out.print("Digite o CPF ou CNPJ: ");
                    String id = sc.nextLine();
                    controller.remover(id);
                    break;

                case 4:
                    // Encerramento do sistema
                    System.out.println("Saindo...");
                    return;
            }
        }
    }
}
