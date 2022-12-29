import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Casting {
    public String nomeCasting;
    public LocalDate dataCasting;
    public List<Modelo> modelosParaCasting = new ArrayList<>();

    public Casting(String nomeCasting, LocalDate dataCasting) {
        this.nomeCasting = nomeCasting;
        this.dataCasting = dataCasting;
    }
}