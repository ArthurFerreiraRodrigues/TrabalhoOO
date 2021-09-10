package util;

public class ReadMenu {
    public static int choice(int last) {
        int choice;

        do {
            System.out.printf("\nEscolha : ");
            choice = Read.Int();
            if (choice > last || choice < 0) {
                System.out.printf("\nDigite uma opção válida.\n");
            }
        } while (choice > last || choice < 0);
        return choice;
    }
}
