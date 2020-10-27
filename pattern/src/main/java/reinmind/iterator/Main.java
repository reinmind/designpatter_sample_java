package reinmind.iterator;

import reinmind.iterator.entity.Book;
import reinmind.iterator.entity.BookShelf;

/**
 * 主类
 *
 * @author zx
 * @date 2020/10/27
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("环游地球80天"));
        bookShelf.appendBook(new Book("格林童话"));
        bookShelf.appendBook(new Book("圣经"));
        bookShelf.appendBook(new Book("灰姑娘"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
