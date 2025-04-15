import java.time.LocalDate;

public class Programador {

    String nombre;
    double salario;
    LocalDate fechaInicio;

    public Programador(String nombre, double salario, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public Programador() {
    }

    public static void main(String[] args) {
        Programador programadorA = new Programador("Donald", 4000.33, LocalDate.of(2019, 12, 12));

    }
}