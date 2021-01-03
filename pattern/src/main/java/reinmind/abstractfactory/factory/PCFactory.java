package reinmind.abstractfactory.factory;

import reinmind.abstractfactory.entity.Computer;
import reinmind.abstractfactory.entity.PC;

public class PCFactory implements ComputerAbstractFactory{
    String ram;
    String hdd;
    String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,cpu,hdd);
    }
}
