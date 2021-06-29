package book_manipulation;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    ArrayList<Book> bookList = new  ArrayList<Book>();

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

    ArrayList<Book> viewAllBooks(){
        return bookList;
    }

   /* ArrayList<Book> viewBooksByAuthor(String author ){
        ArrayList <Book> byAuthor = new ArrayList<>();
        for (Book book : this.bookList){
            if (book.getAuthor().equals(author)) {
                byAuthor.add(book);
            }
        }
        return byAuthor;
    } */



    ArrayList<Book> viewBooksByAuthor(String author ) {
        return this.bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toCollection(ArrayList::new));
    }

       /* int countnoofbook(String bname) {
        int count = 0;
        for (Book book : this.bookList) {
            if (book.getBookName().equals(bname)) {
                count++;
            }
        }
        return count;
    } */

    int countnoofbook(String bname) {
        return (int) this.bookList.stream()
                .filter(book -> book.getBookName().equals(bname))
                .count();
    }
}
