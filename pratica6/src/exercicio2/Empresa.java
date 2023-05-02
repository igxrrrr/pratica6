package exercicio2;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeDeFuncionarios;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionarios = 0;
        this.funcionarios = new Funcionario[100];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionarios < 100) {
            funcionarios[qtdeDeFuncionarios++] = funcionario;
        }
    }
}
