package pipe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Inputer extends Thread {
    private BufferedReader reader;
    private TextLinePipe outPipe;

    public Inputer(String inputFile, TextLinePipe out) {
        try {
            reader = new BufferedReader(new FileReader(inputFile));
        } catch (IOException e) {

            e.printStackTrace();
        }
        outPipe = out;
    }

    @Override
    public void run() {
        while (!outPipe.isWork()) {}
        System.out.println("输入管道启动！");
        String line = "";
        try {
            while ((line = reader.readLine()) != null) {
                while (true) {
                    boolean write = outPipe.writeLine(line);
                    if (write)
                        break;
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        outPipe.endWork();
        System.out.println("输入管道关闭！");
    }
}
