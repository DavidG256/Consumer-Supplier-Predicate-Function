import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ej10 {

    public static void main(String[] args) {

        Map<Integer, String> mapa = new LinkedHashMap<>();

        mapa.put(0, "Paris");
        mapa.put(1, "Madrid");
        mapa.put(2, "Frankfurt");
        mapa.put(3, "Yakarta ");
        mapa.put(4, "Pekin");

        BiConsumer<Integer, String> mapaLambda = (clave, valor) -> System.out.println(clave + " " + valor);
        mapa.forEach(mapaLambda);
    }
}