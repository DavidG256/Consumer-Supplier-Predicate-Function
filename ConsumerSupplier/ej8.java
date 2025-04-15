import java.util.function.BiConsumer;

public class ej8 {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> multiplicacion = (numero1, numero2) -> System.out.println(numero1*numero2);
        multiplicacion.accept(-9, 7);

        BiConsumer<Integer, Integer> suma = (numero1, numero2) -> System.out.println(numero1+numero2);
        suma.accept(-9, 7);

        BiConsumer<Integer, Integer> resta = (numero1, numero2) -> System.out.println(numero1-numero2);
        resta.accept(-9, 7);

        BiConsumer<Integer, Integer> division = (numero1, numero2) -> System.out.println(numero1/numero2);
        division.accept(-9, 7);
    }
}