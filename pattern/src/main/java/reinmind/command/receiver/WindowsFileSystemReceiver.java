package reinmind.command.receiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("opening file Windows file system");
    }

    @Override
    public void writeFile() {
        System.out.println("writing file in Windows file system");
    }

    @Override
    public void closeFile() {
        System.out.println("closing file in Windows file system");
    }
}
