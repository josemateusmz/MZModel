import java.time.LocalDate;

public abstract class Funcionario {
    public String nome;
    public LocalDate dataNascimento;
    public String cpf;
    public double salario;

    public Funcionario(String nome, LocalDate dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
}