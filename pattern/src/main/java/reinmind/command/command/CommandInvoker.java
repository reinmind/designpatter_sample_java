package reinmind.command.command;

import reinmind.command.receiver.FileSystemReceiver;

public class CommandInvoker {
    Command command;
    public CommandInvoker(Command command){
        this.command = command;
    }
    void execute(){
        this.command.execute();
    }
}
