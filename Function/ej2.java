import java.util.function.Function;

public class ej2 {
    public static void main(String[] args) {
        Function<Integer, Integer> potenciaDe2 = n -> (int) Math.pow(2, n);

        int resultado = potenciaDe2.apply(4);
        System.out.println("2 elevado a 4 es: " + resultado);
    }
}