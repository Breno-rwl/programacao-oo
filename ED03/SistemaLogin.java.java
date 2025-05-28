/**
  Interface, verifica se a senha fornecida é válida
 */
interface Autenticavel {
    
    boolean autenticar(String senha);
}

/**
 Interface para usuários que podem ser gerenciados
 */
interface Gerenciavel {
    
    void alterarSenha(String novaSenha);

   
    void bloquearUsuario();
}

/**
 Interface para usuários que podem registrar operações no log
 */
interface Logavel {
    void registrarLog(String operacao);
}

/**
 Classe abstrata que representa um usuário
 */
abstract class Usuario {
    protected String login;
    protected String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
      Exibe o login do usuário
     */
    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
}

/**
 Classe que representa um administrador do sistema
 
 */
class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel {

    public Administrador(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}

/**
 Classe que representa um visitante do sistema

 */
class Visitante extends Usuario {

    public Visitante(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}

/**
  Classe que representa um cliente do sistema
 
 */
class Cliente extends Usuario implements Autenticavel {

    public Cliente(String login, String senha) {
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}

/**
 Classe principal do sistema de login

 */
public class ProgramaLogin {
    public static void main(String[] args) {
        Administrador admin = new Administrador("admin", "admin123");
        Visitante visitante = new Visitante("guest", "qualquer");
        Cliente cliente = new Cliente("joao", "segredo123");

        
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha123");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");

        System.out.println();

       
        visitante.exibirLogin();

        System.out.println();

       
        cliente.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
}
