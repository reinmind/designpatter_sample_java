package reinmind.abstractfactory.factory;

import reinmind.abstractfactory.entity.Computer;
import reinmind.abstractfactory.entity.Server;

public class ServerFactory implements ComputerAbstractFactory{
    String ram;
    String hdd;
    String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,cpu,hdd);
    }
}
