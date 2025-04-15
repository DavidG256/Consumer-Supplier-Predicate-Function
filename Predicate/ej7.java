import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ej7 {

    public static void main(String[] args) {

        List<Integer> Lista = new ArrayList<>();

        Lista.add(12);
        Lista.add(11);
        Lista.add(23);
        Lista.add(22);
        Lista.add(-89);
        Lista.add(60);

        Predicate<Integer> Es22 = i -> i.equals(22);

        long Veces = Lista.stream().filter(Es22).count();

        System.out.println("El número aparece " + Veces + " veces.");


    }
}