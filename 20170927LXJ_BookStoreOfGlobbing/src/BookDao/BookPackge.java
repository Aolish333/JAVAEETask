package BookDao;

import BookDB.BookVirtualDB;
import Books.Book;
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
    public List<Books.Book> showAllBook(){
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
    /**
     * 精确查找书籍
     */
    public void queryBook(Book book){

    }
}
