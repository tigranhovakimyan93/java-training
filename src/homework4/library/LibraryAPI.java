package homework4.library;

import java.util.*;
import java.util.regex.Pattern;

class LibraryAPI {

    static Set<String> getAllAuthors(ArrayList<Book> library) {
        Set<String> authors = new HashSet<>();
        for (Book book : library) {
            authors.add(book.getAuthor().getName());
        }
        return authors;
    }

    static ArrayList<String> getAllBooks(ArrayList<Book> library) {
        ArrayList<String> books = new ArrayList<>();
        for (Book book : library) {
            books.add(book.getTitle());
        }
        return books;
    }

    static ArrayList<String> getAuthorBooks(ArrayList<Book> library, String enteredAuthor) {
        ArrayList<String> books = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().getName().equalsIgnoreCase(enteredAuthor)) {
                books.add(book.getTitle());
            }
        }
        return books;
    }

    static ArrayList<Book> getTopThreeBooks(ArrayList<Book> library, String enteredAuthor) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().getName().equalsIgnoreCase(enteredAuthor)) {
                books.add(book);
            }
        }
        if (books.size() > 0) {
            books.sort(Comparator.comparing(Book::getRating, Collections.reverseOrder()));
            ArrayList<Book> topBooks = new ArrayList<>();
            topBooks.add(books.get(0));
            topBooks.add(books.get(1));
            topBooks.add(books.get(2));
            return topBooks;
        } else {
            return books;
        }
    }

    static Set<String> getMatchingAuthors(ArrayList<Book> library, String enteredArtist) {
        Set<String> authors = new HashSet<>();
        for (Book book : library) {
            if (Pattern.compile(Pattern.quote(enteredArtist), Pattern.CASE_INSENSITIVE).matcher(book.getAuthor().getName()).find()) {
                authors.add(book.getAuthor().getName());
            }
        }
        return authors;
    }

    static ArrayList<String> getMatchingBooks(ArrayList<Book> library, String enteredBook) {
        ArrayList<String> books = new ArrayList<>();
        for (Book book : library) {
            if (Pattern.compile(Pattern.quote(enteredBook), Pattern.CASE_INSENSITIVE).matcher(book.getTitle()).find()) {
                books.add(book.getTitle());
            }
        }
        return books;
    }

    static ArrayList<String> getBooksBetweenDates(ArrayList<Book> library, Date date1, Date date2) {
        ArrayList<String> books = new ArrayList<>();
        for (Book book : library) {
            if (Utils.parseDate(book.getReleaseDate()).after(date1) && Utils.parseDate(book.getReleaseDate()).before(date2)) {
                books.add(book.getTitle());
            }
        }
        return books;
    }
}
