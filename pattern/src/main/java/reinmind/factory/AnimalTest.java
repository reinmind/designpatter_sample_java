package reinmind.factory;

/**
 * 工厂模式就是根据不同的输入获得不同抽象类的实例
 * @author xiang.zhang
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal o1 = AnimalFactory.getInstance(AnimalEnum.DOG);
        Animal o2 = AnimalFactory.getInstance(AnimalEnum.CAT);
        assert o1 != null;
        o1.say();
        assert o2 != null;
        o2.say();
    }
}
