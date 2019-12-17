package pipe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Outputer extends Thread {
    private TextLinePipe inPipe;
    private BufferedWriter writer;
    private boolean firstWrite;

    public Outputer(TextLinePipe in, String outputFile) {
        inPipe = in;
        try {
            writer = new BufferedWriter(new FileWriter(outputFile));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        firstWrite = true;
    }

    @Override
    public void run() {
        if (!inPipe.isWork()) {
            inPipe.startWork();
        }
        System.out.println("输出管道启动！");
        while (inPipe.isWork() || !inPipe.isEmpty()) {
            String line = inPipe.readLine();
            if (line != null) {
                try {
                    if (firstWrite) {
                        firstWrite = false;
                    }
                    else {
                        writer.newLine();
                    }
                    writer.write(line);
                    writer.flush();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        System.out.println("输出管道关闭！");
    }
}
