package reinmind.singleton;

import java.io.Serializable;

/**
 * @author xiang.zhang
 */
public class ThreadSafeSingleton
        implements Serializable
{
    private static ThreadSafeSingleton instance;

    /**
     * 简单地增加synchronized关键字会造成性能损失,但是线程是安全的
     * @return instance
     */
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * 双检单例
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            // 当多个线程走到这个位置时，只会有一个线程进入
            synchronized (ThreadSafeSingleton.class){
                // 当另外一个线程创建完实例之后，将会阻止其他线程创建单例
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 只要实现serializable接口的类都可以override readResolve
     * @return
     */
    protected Object readResolve(){
        return getInstanceUsingDoubleLocking();
    }

}
