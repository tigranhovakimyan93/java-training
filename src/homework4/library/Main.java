package homework4.library;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> library = LibraryProvider.getData();

        System.out.println("Available authors: " + LibraryAPI.getAllAuthors(library));

        System.out.println("Available books: " + LibraryAPI.getAllBooks(library));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an author name");
        String enteredAuthor1 = scanner.nextLine();
        if (LibraryAPI.getAuthorBooks(library, enteredAuthor1).size() == 0) {
            System.out.println("No results");
        } else {
            System.out.println("Search results:" + "\n" + LibraryAPI.getAuthorBooks(library, enteredAuthor1));
        }

        System.out.println("Please enter another author name");
        String enteredAuthor2 = scanner.nextLine();
        if (LibraryAPI.getTopThreeBooks(library, enteredAuthor2).size() == 0) {
            System.out.println("No results");
        } else {
            int place = 1;
            for (int i = 0; i < LibraryAPI.getTopThreeBooks(library, enteredAuthor2).size(); i++, place++) {
                System.out.println("Top " + place + ": " + LibraryAPI.getTopThreeBooks(library, enteredAuthor2).get(i).getTitle());
            }
        }
        System.out.println("Please enter another author name");
        String enteredAuthor3 = scanner.nextLine();
        if (LibraryAPI.getMatchingAuthors(library, enteredAuthor3).size() == 0) {
            System.out.println("No results");
        } else {
            System.out.println("Search results: " + "\n" + LibraryAPI.getMatchingAuthors(library, enteredAuthor3));
        }

        System.out.println("Please enter a book title");
        String enteredBook1 = scanner.nextLine();
        if (LibraryAPI.getMatchingBooks(library, enteredBook1).size() == 0) {
            System.out.println("No results");
        } else {
            System.out.println("Search results: " + "\n" + LibraryAPI.getMatchingBooks(library, enteredBook1));
        }

        System.out.println("Please enter a date in this format: yyyy-MM-dd");
        Date date1 = Utils.parseDate(scanner.nextLine());
        System.out.println("Please enter a date again");
        Date date2 = Utils.parseDate(scanner.nextLine());
        if (date1.after(date2)) {
            System.out.println("The first entered date should be after the second date.");
        } else {
            System.out.println("Search results:\n " + LibraryAPI.getBooksBetweenDates(library, date1, date2));
        }
    }
}

