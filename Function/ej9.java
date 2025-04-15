import java.util.function.BiFunction;
import java.util.function.Function;

public class ej9 {

    public static String mostrarPotencia(int base, int exponente) {
        BiFunction<Integer, Integer, Double> potencia = (a, b) -> Math.pow(a, b);
        Function<Double, String> formatear = resultado -> "Resultado: " + resultado;

        return formatear.apply(potencia.apply(base, exponente));
    }

    public static void main(String[] args) {
        String resultado = mostrarPotencia(2, 4);
        System.out.println(resultado);
    }
}