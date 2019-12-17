package component;

import java.util.ArrayList;

import java.util.List;

public class main {

	public static void main(String[] args) {
        String inputFile = "src/input.txt";
        String outputFile = "src/output.txt";
		List<String> list = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		list = Input.input(inputFile);
		list = Swap.swap(list);
		list = Sort.sort(list);
		Output.output(list,outputFile);


	}

}
