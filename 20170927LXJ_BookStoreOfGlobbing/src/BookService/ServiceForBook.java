package BookService;

import BookDao.BookPackge;

import java.awt.print.Book;
import java.util.List;

public class ServiceForBook {
    private BookPackge bookPackge = new BookPackge();
    public void addBook(Book book){
        bookPackge.addBook(book);
    }
    public List<Book> showAllBook(){
        return bookPackge.showAllBook();
    }
    public void singleFind(){

    }
    public void deleteBook(Book book){

    }
}
