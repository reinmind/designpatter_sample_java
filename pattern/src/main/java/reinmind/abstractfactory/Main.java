package reinmind.abstractfactory;

import reinmind.abstractfactory.entity.Computer;
import reinmind.abstractfactory.factory.ComputerFactory;
import reinmind.abstractfactory.factory.PCFactory;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new PCFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
