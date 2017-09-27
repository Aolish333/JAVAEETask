package BookAction;

import BookService.ServiceForBook;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.awt.print.Book;
import java.util.List;

public class AddBookAction extends ActionSupport implements ModelDriven<Book> {
    Book book = new Book();
    List<Book> bookList;
    ServiceForBook serviceForBook = new ServiceForBook();
// 此处必须写get方法，想想为什么？
    public List<Book> getBookList() {
        return bookList;
    }

    /**
     * 添加书籍
     * @return 返回成功
     */
    public String add(){
        serviceForBook.addBook(book);
        return "addOK";
    }

    /**
     * 显示所有书籍
     * @return 展示书籍
     */
    public String showAll(){
        bookList = serviceForBook.showAllBook();
        return "showBookOK";
    }
    @Override
    public Book getModel() {
        return book;
    }
}
