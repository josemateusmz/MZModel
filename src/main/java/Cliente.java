public class Cliente {
    public String nome;
    public String cnpj;
    public double valorContrato;

    public Cliente(String nome, String cnpj, double valorContrato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.valorContrato = valorContrato;
    }

    public void emitirContrato(Agencia agencia){
        System.out.println("Emitindo contrato entre o cliente " + this.nome + " e a Agência " + agencia.nomeAgencia);
        System.out.println("****************************************************************");
        System.out.println("================Contrato de prestação de serviços===============");
        System.out.println("Valor do contrato: " + this.valorContrato);
        System.out.println("Contrantente: " + this.nome);
        System.out.println("Contratado: " + agencia.nomeAgencia + " CNPJ: " + agencia.cnpj);
        System.out.println("================================================================");
    }

    public void tranfereValorParaAgencia(Financeiro financeiro){
        double impostoSobTranferencia = 0.56;
        financeiro.receita = financeiro.receita + this.valorContrato * impostoSobTranferencia;
    }
}