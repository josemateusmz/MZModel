import java.time.LocalDate;
import java.util.Scanner;

public class Gerente extends Funcionario {

    public Gerente(String nome, LocalDate dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    //método 1
    public void cadastrarNovoModelo(Modelo modelo, Agencia agencia){
        agencia.cadastrarNovosModelos(modelo);
    }

    //método 2
    public void deletarModelo(Agencia agencia){
        exibirModelos(agencia);
        int codigo;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o código correspondente do modelo a ser excluído");
        codigo = scanner.nextInt();
        agencia.modelosList.remove(codigo);
        exibirModelos(agencia);
    }

    //método 3
    public void exibirModelos(Agencia agencia){
        agencia.listarTodosOsModelos();
    }
}