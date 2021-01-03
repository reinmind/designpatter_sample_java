package reinmind.command.command;

import reinmind.command.receiver.FileSystemReceiver;

public class OpenFileCommand implements Command{
    FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    /**
     * 组合接受者和命令
     */
    @Override
    public void execute() {
        fileSystemReceiver.openFile();
    }
}
