package reinmind.singleton;

import java.io.Serializable;

/**
 * 懒加载单例
 */
public class LazyInitializedSingleton implements Serializable {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){}

    /**
     * 在获取单例的时候再加载，但是在多线程的时候回造成线程安全问题
     * @return instance
     */
    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
