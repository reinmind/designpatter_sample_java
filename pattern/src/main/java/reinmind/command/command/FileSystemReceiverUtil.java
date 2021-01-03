package reinmind.command.command;

import reinmind.command.receiver.FileSystemReceiver;
import reinmind.command.receiver.UnixFileSystemReceiver;
import reinmind.command.receiver.WindowsFileSystemReceiver;


public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlylingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:" + osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }
        return new UnixFileSystemReceiver();
    }
}
