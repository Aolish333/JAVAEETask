package BookService;

import BookDao.BookPackge;
import Books.Book;
import java.util.List;

public class ServiceForBook {
    private BookPackge bookPackge = new BookPackge();
    public void addBook(Book book){
        bookPackge.addBook(book);
    }
    public List<Books.Book> showAllBook(){
        return bookPackge.showAllBook();
    }
    public void singleFind(){

    }
    public void deleteBook(Book book){

    }
}
