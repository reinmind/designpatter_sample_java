package reinmind.command.command;

import reinmind.command.receiver.FileSystemReceiver;

public class WritingFileCommand implements Command{
    FileSystemReceiver fileSystemReceiver;

    public WritingFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
