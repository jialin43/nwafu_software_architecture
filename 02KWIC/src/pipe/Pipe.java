package pipe;

public class Pipe {
    private String pipe[];
    private int readIndex;
    private int num_now;
    private boolean isWork;

    public Pipe() {
        pipe = new String[5];
        readIndex = 0;
        num_now = 0;
        isWork = false;
    }

    public synchronized String readLine() {
        if (num_now == 0) {
            return null;
        }
        else {
            String line = pipe[readIndex];
            readIndex = (readIndex + 1) % 5;
            num_now --;
            return line;
        }
    }

    public synchronized boolean writeLine(String line) {
        if (num_now == 5) {
            return false;
        }
        else {
            int writeIndex = (readIndex + num_now) % 5;
            num_now ++;
            pipe[writeIndex] = line;
            return true;
        }
    }

    public void startWork() {
        isWork = true;
    }

    public void endWork() {
        isWork = false;
    }

    public boolean isWork() {
        return isWork;
    }

    public boolean isEmpty() {
        return num_now == 0;
    }
}
