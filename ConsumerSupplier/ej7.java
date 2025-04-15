import java.util.function.BiConsumer;

public class ej7 {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> multiplicacion = (numero1, numero2) -> System.out.println(numero1*numero2);
        multiplicacion.accept(-9, 7);
    }
}