import java.time.LocalDate;
import java.util.Scanner;

public class Booker extends Funcionario {

    public Booker(String nome, LocalDate dataNascimento, String cpf) {
        super(nome, dataNascimento, cpf);
    }

    //método 1
    public void selecionarModeloParaFestaPeloCodigo(Agencia agencia, Casting casting){
        agencia.listarTodosOsModelos();
        int codigo;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o código do modelo a ser selecionado para o casting: ");
        codigo = scanner.nextInt();
        casting.modelosParaCasting.add(agencia.modelosList.get(codigo));
    }

    //método 2
    public void listarModelosDoCasting(Casting casting){
        for(Modelo modelo : casting.modelosParaCasting){
            System.out.println("Nome do modelo: " + modelo.nome);
            System.out.println("Gênero do modelo: " + modelo.genero);
            System.out.println("Codigo modelo: " + modelo.codigo);
        }
    }
}