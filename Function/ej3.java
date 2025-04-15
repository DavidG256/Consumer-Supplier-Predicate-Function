import java.util.function.Function;

public class ej3 {
    public static void main(String[] args) {
        Function<String, Integer> longitudCadena = cadena -> cadena.length();
        Function<Integer, Integer> potenciaDe2 = n -> (int) Math.pow(2, n);

        String texto = "Programación";

        int longitud = longitudCadena.apply(texto);
        int resultado = potenciaDe2.apply(longitud);

        System.out.println("La longitud de " + texto + "es: " + longitud);
        System.out.println("2 elevado a " + longitud + " es: " + resultado);
    }
}