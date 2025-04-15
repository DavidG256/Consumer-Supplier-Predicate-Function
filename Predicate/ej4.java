import java.util.function.Predicate;

public class ej4 {

    public static void main(String[] args) {

        Predicate<Integer> numeroQueNoSea100 = i -> i.equals(100);
        System.out.println(numeroQueNoSea100.test(13));
    }
}