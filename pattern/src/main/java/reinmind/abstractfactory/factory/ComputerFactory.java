package reinmind.abstractfactory.factory;

import reinmind.abstractfactory.entity.Computer;

public class ComputerFactory {
    /**
     * 每个子类都有相应的工厂实现，用来获取子类；
     * 另外还有一个父类工厂，用来获取子类工厂
     * 抽象工厂就是子类工厂的工厂
     * @param computerAbstractFactory
     * @return
     */
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
