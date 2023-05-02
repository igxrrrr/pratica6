package exercicio2;

public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean ativo;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg, boolean ativo) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.ativo = ativo;
    }

    public void bonificar(double valor) {
        this.salario += valor;
    }

    public void demitir() {
        this.ativo = false;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + salario);
        System.out.println("Data de entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("Ativo: " + ativo);
    }
}
