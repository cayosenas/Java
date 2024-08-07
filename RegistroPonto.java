import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroPonto {
    private final List<Funcionario> funcionarios;

    public RegistroPonto() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario buscarFuncionario(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        RegistroPonto registro = new RegistroPonto();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("1. Adicionar Funcionário");
                System.out.println("2. Registrar Entrada");
                System.out.println("3. Registrar Saída");
                System.out.println("4. Mostrar Funcionários");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha
                
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Nome do Funcionário: ");
                        String nome = scanner.nextLine();
                        Funcionario funcionario = new Funcionario(nome);
                        registro.adicionarFuncionario(funcionario);
                        System.out.println("Funcionário adicionado.");
                    }
                        
                    case 2 -> {
                        System.out.print("Nome do Funcionário para registrar entrada: ");
                        String nome = scanner.nextLine();
                        Funcionario funcionario = registro.buscarFuncionario(nome);
                        if (funcionario != null) {
                            funcionario.registrarEntrada();
                        } else {
                            System.out.println("Funcionário não encontrado.");
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Nome do Funcionário para registrar saída: ");
                        String nome = scanner.nextLine();
                        Funcionario funcionario = registro.buscarFuncionario(nome);
                        if (funcionario != null) {
                            funcionario.registrarSaida();
                        } else {
                            System.out.println("Funcionário não encontrado.");
                        }
                    }
                        
                    case 4 -> {
                        for (Funcionario f : registro.funcionarios) {
                            System.out.println(f);
                        }
                    }
                        
                    case 5 -> {
                        continuar = false;
                        System.out.println("Saindo...");
                    }
                        
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
}