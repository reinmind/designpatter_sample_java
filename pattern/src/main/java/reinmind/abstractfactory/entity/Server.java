package reinmind.abstractfactory.entity;

import reinmind.abstractfactory.entity.Computer;

public class Server extends Computer {
    String ram;
    String cpu;
    String hdd;
    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    public Server(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}
