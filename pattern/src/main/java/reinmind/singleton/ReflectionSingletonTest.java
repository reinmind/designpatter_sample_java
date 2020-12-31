package reinmind.singleton;

import java.lang.reflect.Constructor;

/**
 * 反射会破坏所有的单例类
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton instance0 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance1 = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                /**
                 * 直接用反射去创建单例是不合适的做法
                 */
                constructor.setAccessible(true);
                instance1 = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instance0.hashCode());
        assert instance1 != null;
        System.out.println(instance1.hashCode());
    }

}
