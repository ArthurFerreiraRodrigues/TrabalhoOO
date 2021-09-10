package util;

public class Print {

    /**
     * Imprime espaços ate que a palavra esteja ao centro.
     * 
     * @param tamTexto,tamDivisor
     */
    private static void spaces(int tamTexto, int tamDivisor) {

        int quantEspacos, i;
        quantEspacos = (tamDivisor - tamTexto) / 2;

        for (i = 0; i < quantEspacos; i++) {
            System.out.printf(" ");
        }

    }

    /**
     * Cria uma linha e "-" no terminal.
     */
    public static void split() {
        System.out.printf("\n------------------------------------------------------------\n");
    }

    /**
     * Imprime uma string ao centro da linha.
     * 
     * @param title
     */
    public static void title(String title) {
        Print.split();
        Print.spaces(title.length(), 60);
        System.out.print(title);
        Print.split();
    }

    /**
     * Imprime uma string ao centro da linha.
     * 
     * @param title,description
     */
    public static void titleAndDescription(String title, String description) {
        Print.split();
        Print.spaces(title.length(), 60);
        System.out.println(title);

        Print.spaces(description.length(), 60);
        System.out.print(description);
        Print.split();
    }

}
