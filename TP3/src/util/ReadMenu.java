package util;

import main.menu.Print;

public class ReadMenu {
    public static int choice(int last) {
        int choice;

        Print.inicial();
        do {
            System.out.printf("Escolha : ");
            choice = Read.Int();
            if (choice > last || choice < 0) {
                System.out.printf("\nDigite uma opção válida.\n");
            }
        } while (choice > 9 || choice < 0);
        return choice;
    }
}
