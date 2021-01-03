package reinmind.command.command;

import reinmind.command.receiver.FileSystemReceiver;

public class CloseFileCommand implements Command{
    FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.closeFile();
    }
}
