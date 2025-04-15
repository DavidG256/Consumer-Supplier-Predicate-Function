import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ej2 {

    public static void main(String[] args) {

        List<Integer> listaEnteros = new ArrayList<>();
        Consumer<Integer> consumerNumero = name -> System.out.println(name);
        for (int i = 0; i <= 10; i++) {
            listaEnteros.add(i);
        }
        listaEnteros.forEach(consumerNumero);
    }
}