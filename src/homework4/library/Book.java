package homework4.library;

import java.util.Date;

public class Book {

    private Author author;
    private String title;
    private String releaseDate;
    private double rating;

    public Book() {
    }

    Book(Author author, String title, String releaseDate, double rating) {
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    Author getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }

    String getReleaseDate() {
        return releaseDate;
    }

    double getRating() {
        return rating;
    }
}
