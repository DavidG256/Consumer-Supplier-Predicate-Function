import java.util.function.Supplier;

public class ej5 {

    public static void main(String[] args) {

        Supplier<Double> numero = () -> Math.random();
        System.out.println(numero.get());
    }
}