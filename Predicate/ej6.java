import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ej6 {

    public static void main(String[] args) {

        List<Integer> Lista = new ArrayList<>();

        Lista.add(8);
        Lista.add(22);
        Lista.add(12);
        Lista.add(29);




        Predicate<Integer> igualMayorDe25 = i -> i >= 25;
        Predicate<Integer> igualMenorDe30 = i -> i <= 30;
        Predicate<Integer> entre25y30 = igualMayorDe25.and(igualMenorDe30);
        Lista.stream().filter(entre25y30).forEach(integer -> System.out.println(integer));

    }
}