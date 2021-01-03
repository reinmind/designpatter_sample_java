package reinmind.command.receiver;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("opening file in unix system");
    }

    @Override
    public void writeFile() {
        System.out.println("writing file in unix system");
    }

    @Override
    public void closeFile() {
        System.out.println("close file in unix system");
    }

}
