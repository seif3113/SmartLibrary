

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Book implements bookdata {

    private String title;
    private String author;
    private String publisher;
    private String publishing_year;
    private static ArrayList<String> ISBNlist = new ArrayList<>();
    private String ISBN;
    public static ArrayList<Book> booksarr = new ArrayList<>();
    public static ArrayList<String> bookname = new ArrayList<>();
    public static ArrayList<Book> selledBooks = new ArrayList<>();

    public Book() {

    }

    public Book(String title, String author, String publisher, String publishing_year, String isbn) {
        if (this.setISBN(isbn)) {
            this.ISBN = isbn;
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.publishing_year = publishing_year;
            booksarr.add(this);
            booksearch.model.addElement(this);
            ISBNlist.add(ISBN);
            Book.bookname.add(title);
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public String getPublishing_year() {
        return publishing_year;
    }

    @Override
      public String getISBN() {
        return ISBN;
    }
    
 

    public static boolean setISBN(String ISBN) {
        boolean check = true;
        for (int i = 0; i < ISBNlist.size(); i++) {
            if (ISBNlist.get(i).equals(ISBN)) {
                check = false;
                break;
            }
        }
        if (check) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ISBN Already Taken", "Warnning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public static void Remove(int selectedIndex) {
        ISBNlist.remove(selectedIndex);
        booksearch.model.removeElement(booksarr.get(selectedIndex));
        booksarr.remove(selectedIndex);
        Book.bookname.remove(selectedIndex);
    }

    public static void Search(String BookName) {
        for (int i = 0; i < Book.booksarr.size(); i++) {
            if (Book.booksarr.get(i).getTitle().startsWith(BookName)) {
                booksearch.model.addElement(Book.booksarr.get(i));
            }
        }
    }

    
        public static void Searchdefault() 
            {
                
                 booksearch.model.clear();
                for (int i = 0; i < Book.booksarr.size(); i++) {
                    booksearch.model.addElement(Book.booksarr.get(i));
                }
                
                
            }
    
    public static void sellbook(Book book, int i) {
        selledBooks.add(book);
        booksearch.model.removeElement(book);
        Book.booksarr.remove(i);
        Book.bookname.remove(i);
    }

  

}
