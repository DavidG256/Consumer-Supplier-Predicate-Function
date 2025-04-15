import java.util.function.Function;

public class ej7 {
    public static void main(String[] args) {
        Function<Double, String> ej7 = numero -> "Resultado: " + numero;

        String resultado = ej7.apply(32.9);

        System.out.println(resultado);

    }

}