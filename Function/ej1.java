import java.util.function.Function;

public class ej1 {
    public static void main(String[] args) {
        Function<String, Integer> longitudCadena = cadena -> cadena.length();

        String texto = "Programación";

        System.out.println("La longitud de " + texto + " es: " + longitudCadena.apply(texto));
    }

}