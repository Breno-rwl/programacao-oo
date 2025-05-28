/**
 Sistema de folha de pagamento usando herança e polimorfismo

 */
public class ProgramaFolha {

    public static void main(String[] args) {
     
        Funcionario clt = new FuncionarioCLT("Carlos", 2000.0);

        
        Funcionario temp = new FuncionarioTemporario("Ana", 2000.0);

      
        clt.exibirDados();
        System.out.println("Salario Final " + clt.calcularSalario());
        System.out.println();

        
        temp.exibirDados();
        System.out.println("Salario Final " + temp.calcularSalario());
    }
}

/**
 Classe abstrata que representa um funcionario
 */
abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    /**
      Construtor da classe Funcionario
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     Exibe o nome e o salário base do funcionario
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
      metodo abstrato para calcular o salário
     
     */
    public abstract double calcularSalario();
}

/**
  Classe que representa funcionario CLT e que herda classe funcionario

 */
class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    
    @Override
    public double calcularSalario() {
        return salarioBase + 300.0;
    }
}

/**
 * Classe que representa um funcionário temporário com o desconto fixo

 */
class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    
    @Override
    public double calcularSalario() {
        return salarioBase - 100.0;
    }
}
