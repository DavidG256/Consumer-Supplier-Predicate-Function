import java.util.function.Consumer;

public class ej1 {

    public static void main(String[] args) {

        Consumer<String> consumerString = texto -> System.out.println(texto);
        consumerString.accept("Estoy en clase de programación");

    }
}