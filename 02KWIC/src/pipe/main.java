package pipe;

public class main {
    public static void main(String[] args) {
        String inputFile = "src/input.txt";
        String outputFile = "src/output.txt";
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();

        Inputer inputer = new Inputer(inputFile, pipe1);
        Swapper swapper = new Swapper(pipe1, pipe2);
        Sorter sorter = new Sorter(pipe2, pipe3);
        Outputer outputer = new Outputer(pipe3, outputFile);

        inputer.start();
        swapper.start();
        sorter.start();
        outputer.start();
    }
}
