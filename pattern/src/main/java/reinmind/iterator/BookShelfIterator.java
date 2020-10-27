package reinmind.iterator;

import reinmind.iterator.Iterator;
import reinmind.iterator.entity.Book;
import reinmind.iterator.entity.BookShelf;

/**
 * 书架迭代类
 *
 * @author zx
 * @date 2020/10/27
 */
public class BookShelfIterator implements Iterator  {
    private BookShelf bookShelf;
    private int index;

    /**
     * 下标从0开始
     * @param bookShelf
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 若index为1，length为1，则没有下一个元素可以取
     * @return
     */
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 获取当前的book实体，并且下标加1
     * @return
     */
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        ++index;
        return book;
    }


}
