import java.util.function.BiPredicate;

public class ej5 {

    public static void main(String[] args) {

        BiPredicate<String, String> compararStrings  = (s, s2) -> s.equalsIgnoreCase(s2);
        System.out.println(compararStrings.test("cadena", "cadena"));
    }
}