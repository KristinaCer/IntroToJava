package book_manipulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        Library library = new Library();
        while (cont) {
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the isbn no:");
                    int isbn = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the book name:");
                    String name = sc.nextLine();
                    System.out.println("Enter the author name:");
                    String author = sc.nextLine();
                    Book book = new Book();
                    book.setIsbnno(isbn);
                    book.setBookName(name);
                    book.setAuthor(author);
                    library.addBook(book);
                    break;
                case 2:
                    library.getBookList().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter the author name:");
                    String authorName = sc.nextLine();
                    if (library.viewBooksByAuthor(authorName).isEmpty()) {
                        System.out.println("None of the book published by the author" + authorName);
                    } else {
                        for (Book bookByAuthor : library.viewBooksByAuthor(authorName)) {
                            System.out.println("ISBN no: " + bookByAuthor.getIsbnno());
                            System.out.println("Book name: " + bookByAuthor.getBookName());
                            System.out.println("Author name: " + bookByAuthor.getAuthor());
                        }
                    }
                    break;
                case 4:

                    break;
                case 5:
                    cont = false;
                    break;
            }
        }
    }
}
