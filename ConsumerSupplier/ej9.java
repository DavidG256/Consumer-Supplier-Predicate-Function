import java.util.function.BiConsumer;

public class ej9 {

    static public void calculator (BiConsumer <Integer, Integer> biNumeros) {
        biNumeros.accept(6, 9);
    }

    public static void main(String[] args) {

        calculator((x, y) -> System.out.println(x + " + " + y + " = "  + (x + y)));
        calculator((x, y) -> System.out.println(x + " - " + y + " = "  + (x - y)));
        calculator((x, y) -> System.out.println(x + " * " + y + " = "  + (x * y)));
        calculator((x, y) -> System.out.println(y + " / " + x + " = "  + (y / x)));
    }

}