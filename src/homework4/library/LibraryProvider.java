package homework4.library;

import java.util.ArrayList;

final class LibraryProvider {

    private static ArrayList<Book> library;

    private LibraryProvider() {
        throw new UnsupportedOperationException();
    }

    static ArrayList<Book> getData() {

        if (library != null) {
            return library;
        }
        Author hugo = new Author("Victor Hugo");
        Author tumanyan = new Author("Hovhannes Tumanyan");
        Author sevak = new Author("Paruyr Sevak");
        Author remark = new Author("Erich Maria Remarque");

        Book book1 = new Book(hugo, "Tshvarner", "1862-03-27", 8.8);
        Book book2 = new Book(hugo, "Parizi astvacamor tachary", "1831-01-30", 9.9);
        Book book3 = new Book(hugo, "Mardy vory cicaxum er", "1869-09-09", 6.7);
        Book book4 = new Book(tumanyan, "Shunn u katun", "1886-07-23", 10);
        Book book5 = new Book(tumanyan, "Anush", "1890-02-28", 7.7);
        Book book6 = new Book(tumanyan, "Akhtamar", "1891-04-03", 6.4);
        Book book7 = new Book(sevak, "Anlreli zangakatun", "1959-08-11", 10);
        Book book8 = new Book(sevak, "Mardy api mej", "1964-02-21", 9.8);
        Book book9 = new Book(sevak, "Anmahnery hramayum en", "1948-12-12", 8.9);
        Book book10 = new Book(remark, "Arevmtyan razmachakatum anpopox e", "1929-11-11", 9.9);
        Book book11 = new Book(remark, "Sirir merdzavorid", "1945-10-10", 8.5);
        Book book12 = new Book(remark, "Ereq ynker", "1936-08-08", 4.6);
        Book book13 = new Book(remark, "Haghtakan kamar", "1945-09-27", 5.6);
        Book book14 = new Book(remark, "Veradardz", "1031-08-29", 5.6);
        Book book15 = new Book(sevak, "Sayat Nova", "1969-09-16", 7.7);
        Book book16 = new Book(sevak, "Eghici luys", "1969-03-02", 7.9);
        Book book17 = new Book(tumanyan, "Mi katil meghry", "1909-04-28", 7.4);
        Book book18 = new Book(tumanyan, "Qaj Nazar", "1922-06-12", 8.3);
        Book book19 = new Book(hugo, "Tsovi mshaknery", "1866-07-28", 8.7);
        Book book20 = new Book(hugo, "Klod Ge", "1834-12-31", 4.8);

        library = new ArrayList<>();

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        library.add(book6);
        library.add(book7);
        library.add(book8);
        library.add(book9);
        library.add(book10);
        library.add(book11);
        library.add(book12);
        library.add(book13);
        library.add(book14);
        library.add(book15);
        library.add(book16);
        library.add(book17);
        library.add(book18);
        library.add(book19);
        library.add(book20);
        return library;
    }
}
