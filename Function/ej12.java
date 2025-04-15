import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ej12 {

    public static void main(String[] args) {

        List<String> Lista = Arrays.asList("flauta", "trompeta", "violonchelo", "gaita");

        BiFunction<String, String, String> eje12 = (a, b) -> {
            for (String lista : Lista) {
                if (lista.startsWith(b)) {
                    System.out.println(lista);
                } else {
                    System.out.println("null");
                }
            }
            return " ";
        };

        System.out.println(eje12.apply(" ", "g"));
    }
}