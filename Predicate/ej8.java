import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ej8 {

    public static void main(String[] args) {

        List<String> Lista = Arrays.asList("barco", "maton", "autenticidad", "adios", "atrás", "llave");

        Predicate<String> empiezaPorA = a -> a.toLowerCase().startsWith("a");
        Predicate<String> longitud5 = a -> a.length() == 5;

        System.out.println("Palabras que empiezan por A: ");
        for (String palabra : Lista) {
            if (empiezaPorA.test(palabra)) {
                System.out.println(palabra);
            }
        }

        System.out.println("Palabras con 5 letras: ");
        for (String palabra : Lista) {
            if (longitud5.test(palabra)) {
                System.out.println(palabra);
            }
        }
    }
}