package products;

import java.util.ArrayList;

import model.Data;
import model.Product;
import util.Print;
import util.Read;

public class Book extends Product {
    private String author, title, type, genre;

    // Costructor

    public Book(int id, double price, int inStockQuant, String author, String title, String type, String genre) {
        super(id, price, inStockQuant);
        this.author = author;
        this.title = title;
        this.type = type;
        this.genre = genre;
    }

    // Getters

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getGenre() {
        return genre;
    }

    // Lister

    public void list() {
        Print.titleAndDescription("Lista de Livros", "ID | Tipo | Preço | Estoque | Autor | Título | Gênero | Tipo");
        int i = 1;
        for (Product product : Data.getProducts()) {
            if (product instanceof Book) {
                System.out.printf("%d. ", i, ((Book) product).toString(), " | %s | %s\n", ((Book) product).getGenre(),
                        ((Book) product).getType());
                i++;
            }
        }
        Print.split();
    }

    @Override
    public String toString() {
        return this.getId() + " | Livro | R$ " + this.getPrice() + " | " + this.getInStockQuant() + " | "
                + this.getAuthor() + " | " + this.getTitle();
    }

    // Setter

    public void updateInfo() {
        Print.title("Alterar Dados de Livro");
        System.out.printf("Novo Código de Identificação :");
        id = Read.Int();
        System.out.printf("Novo Autor :");
        author = Read.Line();
        System.out.printf("Novo Título :");
        title = Read.Line();
        System.out.printf("Novo Tipo :");
        type = Read.Line();
        System.out.printf("Novo Gênero :");
        genre = Read.Line();
        System.out.printf("Novo Preço :");
        price = Read.Double();
        System.out.printf("Nova Quantidade em Estoque :");
        inStockQuant = Read.Int();
    }

    // Searches

    public ArrayList<Book> searchByAuthor(String searchInput) {
        ArrayList<Book> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Book) {
                if (((Book) product).getAuthor() == searchInput) {
                    matches.add(((Book) product));
                    hasMatches = true;
                }

            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }
    }

    public ArrayList<Book> searchByTitle(String searchInput) {
        ArrayList<Book> matches = new ArrayList<>();
        boolean hasMatches = false;

        for (Product product : Data.getProducts()) {
            if (product instanceof Book) {
                if (((Book) product).getTitle() == searchInput) {
                    matches.add(((Book) product));
                    hasMatches = true;
                }
            }
        }

        if (hasMatches) {
            return matches;
        } else {
            return null;
        }
    }

}
