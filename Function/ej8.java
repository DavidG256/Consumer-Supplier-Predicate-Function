import java.util.function.BiFunction;
import java.util.function.Function;

public class ej8 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> potencia = (base, exponente) -> Math.pow(base, exponente);

        Function<Double, String> Resultado = numero -> "Resultado: " + numero;

        String resultadoFinal = Resultado.apply(potencia.apply(2, 4));

        System.out.println(resultadoFinal);
    }
}