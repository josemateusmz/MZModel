import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Modelo {

    public String nome;
    public LocalDate dataDeNascimento;
    public Year anoNascimento;
    public Medidas medidas;
    public char genero;
    public int codigo;

    public Modelo(String nome, LocalDate nascimento, Medidas medidas, char genero) {
        this.nome = nome;
        this.dataDeNascimento = nascimento;
        this.medidas = medidas;
        this.genero = genero;
    }

    Scanner scanner= new Scanner(System.in);

    //método 1
    public void atualizarMedida(){
        System.out.println("Digite seu novo manequim (o atual é: " + this.medidas.manequim + "): ");
        int numeroManequim = scanner.nextInt();
        this.medidas.manequim = numeroManequim;
        System.out.println("Digite sua nova altura (o atual é: " + this.medidas.altura + "): ");
        double numeroAltura = scanner.nextDouble();
        this.medidas.altura = numeroAltura;
        System.out.println("Digite seu novo calçado (o atual é: " + this.medidas.calçado + "): ");
        int numeroCalcado = scanner.nextInt();
        this.medidas.calçado = numeroCalcado;
        System.out.println("Digite seu novo calçado (o atual é: " + this.medidas.calçado + "): ");
        double peso = scanner.nextDouble();
        this.medidas.peso = peso;
    }

    //método 2
    public void calcularIMC(){
        this.medidas.imc = this.medidas.peso/(this.medidas.altura*this.medidas.altura);
    }
}