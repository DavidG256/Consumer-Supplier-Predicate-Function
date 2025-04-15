import java.util.function.Predicate;

public class ej1 {
    public static void main(String[] args) {
        Predicate<Integer> mayorQue100 = n -> n > 100;

        System.out.println(mayorQue100.test(123));
    }

}
