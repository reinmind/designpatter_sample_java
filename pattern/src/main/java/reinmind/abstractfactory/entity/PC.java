package reinmind.abstractfactory.entity;

import reinmind.abstractfactory.entity.Computer;

public class PC extends Computer {
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

    @Override
    public String getCPU() {
        return cpu;
    }

    public PC(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
}
