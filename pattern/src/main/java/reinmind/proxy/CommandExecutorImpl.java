package reinmind.proxy;

import java.io.OutputStream;
import java.util.stream.Stream;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String cmd) throws Exception {
        //
        Process p= Runtime.getRuntime().exec(cmd);
        System.out.println("'"+cmd+"' executed.");
        System.out.println(p.getErrorStream().available());
    }
}
