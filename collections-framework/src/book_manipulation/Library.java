package book_manipulation;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
  ArrayList<Book> bookList = new ArrayList<>();

  public ArrayList<Book> getBookList() {
    return bookList;
  }

  public void setBookList(ArrayList<Book> bookList) {
    this.bookList = bookList;
  }

  public void addBook(Book bobj) {
    this.bookList.add(bobj);
  }

  public boolean isEmpty() {
    return bookList.isEmpty();
  }

  ArrayList<Book> viewAllBooks() {
    return bookList;
  }

  ArrayList<Book> viewBooksByAuthor(String author) {
    return bookList.stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toCollection(ArrayList::new));
  }

  int countnoofbook(String bname) {
    return (int) bookList.stream().filter(book -> book.getBookName().equals(bname)).count();
  }
}
