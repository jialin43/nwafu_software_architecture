package component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "C:/input.txt";
		String output = "C:/output.txt";
		List<String> list = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		list = Input.input(input);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			String[] data = list.get(i).split(" ");
			String str = Arrays.toString(Swap.swap(data));
			str.substring(1, str.length()-1);
			result.add(str);
		}
		Output.output(result, output);
	}

}
