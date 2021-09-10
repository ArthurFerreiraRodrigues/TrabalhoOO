package util;

public class Screen {
    public static void clear() {
        System.out.print("\033\143");
    }

    public static void pressEnterCont() {

        System.out.printf("Aperte ENTER para continuar.");
        Print.split();
        Read.Line();
    }

    public static void pressEnterBack() {
        System.out.printf("Aperte ENTER para voltar.");
        Print.split();
        Read.Line();
    }
}
