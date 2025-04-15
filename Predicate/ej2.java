import java.util.function.Predicate;

public class ej2 {

    public static void main(String[] args) {
        Predicate<Integer> Entre100y300 = i -> i >= 100 && i <= 300;
        System.out.println(Entre100y300.test(446));
    }
}