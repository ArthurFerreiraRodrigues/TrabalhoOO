package util;

public class Screen {
    public static void clear() {
        System.out.print("\033\143");
    }

    public static void pressEnter() {
        Print.split();
        System.out.printf("Aperte ENTER para continuar.");
        Print.split();
        Read.Line();
    }
}
