package reinmind.command.command;

import reinmind.command.receiver.FileSystemReceiver;

import java.util.ArrayList;
import java.util.List;

public class FileSystemClient {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlylingFileSystem();

        List<Command> commandList = new ArrayList<>();
        commandList.add(new OpenFileCommand(fs));
        commandList.add(new WritingFileCommand(fs));
        commandList.add(new CloseFileCommand(fs));

        commandList.stream().forEach(command -> {
            new CommandInvoker(command).execute();
        });
//        //组合打开文件命令
//        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
//        CommandInvoker commandInvoker = new CommandInvoker(openFileCommand);
//        commandInvoker.execute();
//
//        //组合写文件命令
//        WritingFileCommand writingFileCommand = new WritingFileCommand(fs);
//        commandInvoker = new CommandInvoker(writingFileCommand);
//        commandInvoker.execute();
//
//        //组合关文件命令
//        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
//        commandInvoker = new CommandInvoker(closeFileCommand);
//        commandInvoker.execute();
    }
}
