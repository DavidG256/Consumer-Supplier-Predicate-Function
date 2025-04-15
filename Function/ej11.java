import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class ej11 {

    public static void main(String[] args) {
        List<String> Lista = Arrays.asList("flauta", "trompeta", "violonchelo", "gaita");

        BiFunction<String, Integer, String> ej111 = (a, b) -> {
            for (String lista : Lista) {
                if (lista.length() > b) {
                    System.out.println(lista);
                } else {
                    System.out.println("null");
                }

            }
            return " ";
        };

        System.out.println(ej111.apply(" ", 8));
    }
}