import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ej3 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Ferrari");
        lista.add("Mclaren");
        lista.add("Williams");
        lista.add("Renault");

        Consumer<String> consumerLista = consumer -> System.out.println(consumer.charAt(consumer.length() - 1));
        lista.forEach(consumerLista);
    }
}
