package BookAction;

import BookService.ServiceForBook;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import Books.Book;
import java.util.List;

;

public class AddBookAction extends ActionSupport implements ModelDriven<Book> {
    Book book = new Book();

    public List<Book> getBooks() {
        return books;
    }

    List<Book> books;
    ServiceForBook serviceForBook = new ServiceForBook();
// 此处必须写get方法，想想为什么？

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
        books = serviceForBook.showAllBook();
        return "showBookOK";
    }

    /**
     * 精确查找书籍
     * @param book
     * @return
     */
    public String singleQuery(Book book){

        return "";
    }

    /**
     * 删除书籍
     * @return
     */
    public String delete(){

        return "";
    }

    /**
     * 修改书籍
     * @return
     */
    public String alter(){
        return "";
    }
    @Override
    public Book getModel() {
        return book;
    }
}
