import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ej9 {

    public static void main(String[] args) {
        List<String> laLista = Arrays.asList("parca", "maton", "autenticidad", "pastor", "atrás", "pañal");

        Predicate<String> noEmpPorP = a -> !a.toLowerCase().startsWith("p");


        System.out.println("palabras que no empiezan por P: ");
        for (String palabra : laLista) {
            if (noEmpPorP.test(palabra)) {
                System.out.println(palabra);
            }
        }
    }
}