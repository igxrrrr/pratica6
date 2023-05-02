package exercicio2;

// Main
public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("João", "joao@email.com", "11987654321", "Desenvolvimento", 4000.0, "02/05/2020", "123456789", true);

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("---------------------------");
        }

        Empresa empresa = new Empresa("Minha Empresa", "12.345.678/0001-99");

        for (Funcionario funcionario : funcionarios) {
            empresa.adicionarFuncionario(funcionario);
        }
    }
}
