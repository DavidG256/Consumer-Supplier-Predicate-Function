import java.util.function.Supplier;

public class ej4 {

    public static void main(String[] args) {

        Supplier<String> texto = () -> "Java es un lenguaje de programación";
        System.out.println(texto.get());
    }
}