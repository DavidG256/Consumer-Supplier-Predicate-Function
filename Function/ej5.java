import java.util.function.BiFunction;

public class ej5 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;

        int resultado = suma.apply(8, 7);

        System.out.println("La suma de 8 y 7 es: " + resultado);

    }
}