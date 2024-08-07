import java.time.LocalDateTime;

public class Funcionario {
    private final String nome;
    private LocalDateTime entrada;
    private LocalDateTime saida;

    public Funcionario(String nome) {
        this.nome = nome;
        this.entrada = null;
        this.saida = null;
    }

    public String getNome() {
        return nome;
    }

    public void registrarEntrada() {
        if (entrada == null) {
            entrada = LocalDateTime.now();
            System.out.println(nome + " registrou a entrada em " + entrada);
        } else {
            System.out.println(nome + " já registrou a entrada.");
        }
    }

    public void registrarSaida() {
        if (entrada != null && saida == null) {
            saida = LocalDateTime.now();
            System.out.println(nome + " registrou a saída em " + saida);
        } else if (saida != null) {
            System.out.println(nome + " já registrou a saída.");
        } else {
            System.out.println("A entrada deve ser registrada antes da saída.");
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", entrada=" + entrada +
                ", saida=" + saida +
                '}';
    }
}