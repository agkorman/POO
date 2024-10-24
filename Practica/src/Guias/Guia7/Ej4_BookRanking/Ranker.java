package Guias.Guia7.Ej4_BookRanking;

import java.util.*;

public class Ranker {

    private Map<Genre, Map<Book, Integer>> books = new HashMap<>();

    public void add(Genre gen, Book book) {
        if (!books.containsKey(gen)) {
            books.put(gen, new HashMap<>());
        }
        books.get(gen).put(book, 0);
    }

    public void rateUp(Book b) {
        for (Map.Entry<Genre, Map<Book, Integer>> entry : books.entrySet()) {
            Map<Book, Integer> genreBooks = entry.getValue();

            if (genreBooks.containsKey(b)) {
                int rate = genreBooks.get(b);
                genreBooks.put(b, rate + 1);
            }
        }
    }

    public void printRanking(Genre gen) {
        if (!books.containsKey(gen)) {
            System.out.println("Ranking of %s\n".formatted(gen.name()));
            return;
        }

        StringBuilder ans = new StringBuilder("Ranking of %s\n".formatted(gen.name()));

        Set<Map.Entry<Book, Integer>> genreBook = books.get(gen).entrySet();
        for (Map.Entry<Book, Integer> entry : genreBook) {
            ans.append(entry.getKey()).append(" : ").append(entry.getValue()).append('\n');
        }

        System.out.println(ans.toString());
    }

    public void printRanking() {
        for (Genre genre : Genre.values()) {
            printRanking(genre);
        }
    }

}
