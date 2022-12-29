public class Financeiro {
    public final String nomeDepartamento = "Departamento financeiro";
    public double receita;

    //método 1
    public void distribuiSalario(Funcionario funcionario){
        if(funcionario instanceof Gerente){
            double salarioGerente = (this.receita / 100) * 0.75;
            funcionario.salario = salarioGerente;
            this.receita -= salarioGerente;
        } else if (funcionario instanceof Booker) {
            double salarioBooker = (this.receita / 100) * 0.55;
            funcionario.salario = salarioBooker;
            this.receita -= salarioBooker;
        }
    }
}