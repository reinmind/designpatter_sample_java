package reinmind.iterator.entity;

import reinmind.iterator.Aggregate;
import reinmind.iterator.BookShelfIterator;
import reinmind.iterator.Iterator;

import java.util.function.Consumer;

/**
 * 书架类
 *
 * @author zx
 * @date 2020/10/27
 */
public class BookShelf implements Aggregate {
    /**
     * 当存储book数据结构发生变化时，同样可以用iterator遍历bookshelf当中的book实体
     */
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
    public int getLength(){
        return last;
    }
    public void appendBook(Book book){
        this.books[last] = book;
        ++last;
    }
    public Book getBookAt(int index){
        return books[index];
    }

}
