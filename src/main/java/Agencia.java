import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    public String nomeAgencia;
    public String cnpj;
    public List<Modelo> modelosList = new ArrayList<>();

    public int codigo;

    public Agencia(String nomeAgencia, String cnpj) {
        this.nomeAgencia = nomeAgencia;
        this.cnpj = cnpj;
    }

    //metodo 1
    public void cadastrarNovosModelos(Modelo modelo){
        this.modelosList.add(modelo);
        modelo.codigo = this.codigo;
        this.codigo += 1;
    }

    //metodo 2
    public void listarTodosOsModelos(){
        System.out.println("Listando todos os modelos abaixo");
        for(Modelo modelo : modelosList){
            System.out.println("Nome do modelo: " + modelo.nome);
            System.out.println("Gênero do modelo: " + modelo.genero);
            int idadeModelo = LocalDate.now().getYear() - modelo.dataDeNascimento.getYear();
            System.out.println("Idade do modelo: " + idadeModelo);
            System.out.println("Codigo modelo: " + modelo.codigo + "\n");
        }
    }
}