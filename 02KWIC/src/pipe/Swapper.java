package pipe;

public class Swapper extends Thread {
    Pipe inPipe;
    Pipe outPipe;

    public Swapper(Pipe in, Pipe out) {
        inPipe = in;
        outPipe = out;
    }

    @Override
    public void run() {
        while (!outPipe.isWork()) {}
        System.out.println("切换管道启动！");
        inPipe.startWork();
        while (inPipe.isWork() || !inPipe.isEmpty()) {
            String line = inPipe.readLine();
            if (line != null) {
                writeLine(line);
                int j = 0;
                while (line.indexOf(' ', j) != -1) {
                    int index = line.indexOf(' ', j) + 1;
                    writeLine(line.substring(index) + " " + line.substring(0, index - 1));
                    j = index;
                }
            }
        }
        outPipe.endWork();
        System.out.println("切换管道关闭！");
    }

    private void writeLine(String line) {
        while (true) {
            boolean write = outPipe.writeLine(line);
            if (write)
                break;
        }
    }
}
