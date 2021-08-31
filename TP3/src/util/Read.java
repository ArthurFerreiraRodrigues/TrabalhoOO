package utils;

import java.util.Scanner;

@SuppressWarnings("resource")

/**
 * Classe utilizada para facilitar lidar com buffer de teclado.
 */
public class Read {
    public static int Int() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public static double Double() {
        Scanner sc = new Scanner(System.in);

        return sc.nextDouble();
    }

    public static String Line() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    public static char Char() {
        Scanner sc = new Scanner(System.in);

        return sc.next().charAt(0);
    }

    /**
     * Lê a entrada de escolha de opção do menu
     * 
     * @return Opção escolhida
     * 
     * @see appmain.Menu
     */
    public static int menu() {
        System.out.printf("Escolha : ");
        return Read.Int();
    }
}
