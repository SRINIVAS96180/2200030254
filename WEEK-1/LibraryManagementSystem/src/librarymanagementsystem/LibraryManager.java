package librarymanagementsystem;

import java.util.*;

public class LibraryManager {
    private Book[] books;

    public LibraryManager(Book[] books) {
        this.books = books;
    }

    public Book linearSearchByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] collection = {
            new Book(101, "C Programming", "Dennis Ritchie"),
            new Book(102, "Algorithms", "CLRS"),
            new Book(103, "Database Systems", "Ramakrishnan"),
            new Book(104, "Java Basics", "James Gosling"),
            new Book(105, "Python Guide", "Guido Van Rossum")
        };

        LibraryManager manager = new LibraryManager(collection);

        System.out.println("Linear Search: ");
        System.out.println(manager.linearSearchByTitle("Java Basics"));

        Arrays.sort(collection, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        manager = new LibraryManager(collection);

        System.out.println("Binary Search: ");
        System.out.println(manager.binarySearchByTitle("Java Basics"));
    }
}
