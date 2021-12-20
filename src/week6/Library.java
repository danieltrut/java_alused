package week6;

import java.util.*;

public class Library {
    private ArrayList<Book> myLibrary;
    public Library() {       // constructor
        this.myLibrary = new ArrayList<Book>();
    }
    public void addBook(Book newBook) {
        this.myLibrary.add(newBook);   }
    public void printBooks() {
        for (Book printBook : this.myLibrary) {
            System.out.println(printBook);
        }
    }
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book findTitle : this.myLibrary) {
            if (SmUtil.included(findTitle.title(), title)) {
                found.add(findTitle);
            }}
        return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book findPublisher : this.myLibrary) {
            if (SmUtil.included(findPublisher.publisher(), publisher)) {  // new if
                found.add(findPublisher);
            }
        }
        return found;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book findYear : this.myLibrary) {
            if (findYear.year() == year) {
                found.add(findYear);
            }
        }
        return found;
    }
}