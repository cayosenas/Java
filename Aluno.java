public class Aluno {
    private final String nome;
    private final int nota1;
    private final int nota2;
    private final int nota3;
    private final int nota4;

    public Aluno(String nome, int matricula, int nota1, int nota2, int nota3, int nota4){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void calcularMedia(){
        int media = nota1 + nota2 + nota3 + nota4 / 4;
        if (media > 24){
            System.out.println("Aluno " + nome + " aprovado com " + media + " na média.");
        }
    }
    
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno("Bob", 0, 6, 6, 8, 10);
        meuAluno.calcularMedia();
    }
}