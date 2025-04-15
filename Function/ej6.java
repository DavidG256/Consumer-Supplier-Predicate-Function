import java.util.function.BiFunction;

public class ej6 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> potencia = (base, exponente) -> Math.pow(base, exponente);

        double resultado = potencia.apply(2, 3);

        System.out.println("2 elevado a 3 es: " + resultado);

    }
}