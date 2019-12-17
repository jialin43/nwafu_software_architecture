package component;

import java.util.ArrayList;

import java.util.List;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "D:/input.txt";
		String output = "D:/output.txt";
		List<String> list = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		list = Input.input(input);
		list = Swap.swap(list);
		list = Sort.sort(list);
		Output.output(list,output);


	}

}
