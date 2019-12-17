package pipe;

import java.util.ArrayList;

public class Sorter extends Thread {

    TextLinePipe inPipe;
    TextLinePipe outPipe;
    ArrayList<String> sortedLines;

    public Sorter(TextLinePipe in, TextLinePipe out) {
        inPipe = in;
        outPipe = out;
        sortedLines = new ArrayList<String>();
    }

    @Override
    public void run() {
        while (!outPipe.isWork()) {
        }
        System.out.println("排序管道启动！");
        inPipe.startWork();
        while (inPipe.isWork() || !inPipe.isEmpty()) {
            String line = inPipe.readLine();
            if (line != null) {
                int i = 0;
                for (; i < sortedLines.size(); i++) {
                    String line_p = sortedLines.get(i);
                    if (line.compareTo(line_p) < 0)
                        break;
                }
                sortedLines.add(i, line);
            }
        }
        int size = sortedLines.size();
        while (size > 0) {
            String line = sortedLines.remove(0);
            boolean write = outPipe.writeLine(line);
            if (write) {
                size--;
            } else {
                sortedLines.add(0, line);
            }
        }
        outPipe.endWork();
        System.out.println("排序管道关闭！");
    }

}
