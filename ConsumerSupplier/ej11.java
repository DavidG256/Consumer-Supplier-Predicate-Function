import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ej11 {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fechaForm = fecha.format(formFecha);
        System.out.println(fechaForm);
    }
}