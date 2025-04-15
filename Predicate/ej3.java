import java.util.function.Predicate;

public class ej3 {

    public static void main(String[] args) {

        Predicate<Integer> entre100y50 = i -> i > 100 || i < 50;
        System.out.println(entre100y50.test(68));
    }
}