package pipe;

public class main {
    public static void main(String[] args) {
        //String input = "D:/input.txt";
        //String output = "D:/output.txt";
        String inputFile = "src/input.txt";
        String outputFile = "src/output.txt";
        TextLinePipe pipe1 = new TextLinePipe();
        TextLinePipe pipe2 = new TextLinePipe();
        TextLinePipe pipe3 = new TextLinePipe();

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
