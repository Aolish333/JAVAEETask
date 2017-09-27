package BookDao;

import BookDB.BookVirtualDB;

import java.awt.print.Book;
import java.util.List;

public class BookPackge {
    /**
     * 添加书籍
     */
    public void addBook(Book book){
        BookVirtualDB.books.add(book);
    }
    /**
     * 显示所有书籍
     */
    public List<Book> showAllBook(){
        return BookVirtualDB.books;
    }
    /**
     * 删除书籍
     */
    public void deleteBook(Book book){

    }
    /**
     * 修改书籍信息
     */
    public void modifyBook(Book book){

    }
}
