import java.time.LocalDate;
import java.time.Year;

public class MetodoPrincipalParaTeste {
    public static void main(String[] args) {

        //POPULANDO TABELAS
        //medidas
        Medidas medidas = new Medidas(1.88, 40, 41, 65.9);

        //modelos
        Modelo tadeu = new Modelo("André Leonardo", LocalDate.parse("2000-08-15"), medidas, 'M');
        Modelo jose = new Modelo("Jose Leonardo", LocalDate.parse("2002-10-12"), medidas, 'M');
        Modelo amanda = new Modelo("Amanda Sivla", LocalDate.parse("1999-08-15"), medidas, 'F');
        Modelo ana = new Modelo("Ana Maria", LocalDate.parse("2001-10-12"), medidas, 'F');
        Modelo jos = new Modelo("Jos Leonardo", LocalDate.parse("2000-08-15"), medidas, 'M');
        Modelo vitos = new Modelo("Victo Silva", LocalDate.parse("2002-10-12"), medidas, 'M');
        Modelo julia = new Modelo("Julia Cardoso", LocalDate.parse("1999-08-15"), medidas, 'F');
        Modelo mirtis = new Modelo("Mirtis Maria", LocalDate.parse("2001-10-12"), medidas, 'F');

        //agencia
        Agencia agencia = new Agencia("MZ", "12.365.698/0000-15");

        //gerente
        Gerente gerente = new Gerente("Antônia Leão", LocalDate.parse("1988-02-14"), "158-693-002-66");

        //Casting
        Casting casting = new Casting("Cating D2", LocalDate.now());

        //Booker
        Booker booker = new Booker("André Melo", LocalDate.parse("1999-01-22"), "158-693-582-00");

        Cliente cliente = new Cliente("Versace", "15.698.693/5800-00", 58900.00);

        Financeiro financeiro = new Financeiro();

        //TESTE GERENTE
        //cadastrando novos modelos
        gerente.cadastrarNovoModelo(tadeu, agencia);
        gerente.cadastrarNovoModelo(jose, agencia);
        gerente.cadastrarNovoModelo(ana, agencia);
        gerente.cadastrarNovoModelo(amanda, agencia);
        gerente.cadastrarNovoModelo(jos, agencia);
        gerente.cadastrarNovoModelo(julia, agencia);
        gerente.cadastrarNovoModelo(mirtis, agencia);
        gerente.cadastrarNovoModelo(vitos, agencia);
        //teste deletar modelo
        gerente.deletarModelo(agencia);
        //teste exibir modelos da agencaia
        gerente.exibirModelos(agencia);

        //TESTE MODELO
        //atualizando medidas
        tadeu.atualizarMedida();
        //calculando imc
        System.out.println("IMC atual de " + tadeu.nome + ": " + tadeu.medidas.imc);
        tadeu.calcularIMC();
        System.out.println("IMC novo de " + tadeu.nome + ": " + tadeu.medidas.imc + "\n");

        //TESTE BOOKER
        //selecionando modelo para casting
        booker.selecionarModeloParaFestaPeloCodigo(agencia, casting);
        //listando modelos do casting
        booker.listarModelosDoCasting(casting);

        //TESTE CLIENTE
        //gerar contrato
        cliente.emitirContrato(agencia);
        //tranferir valor do contrato para finaceiro
        System.out.println("Saldo atual em receita: " + financeiro.receita);
        cliente.tranfereValorParaAgencia(financeiro);
        System.out.println("Novo saldo em receita: " + financeiro.receita + "\n");

        //TESTE FINANCEIRO
        //
        System.out.println("Saldo atual em receita antes de distribuir o salário: " + financeiro.receita);
        financeiro.distribuiSalario(booker);
        financeiro.distribuiSalario(gerente);
        System.out.println("Novo saldo em receita após distribuir o salário: " + financeiro.receita);
        System.out.println("Salário do gerente após a distribuição de receita" + gerente.salario);
        System.out.println("Salário do booker após a distribuição de receita" + booker.salario);
    }
}