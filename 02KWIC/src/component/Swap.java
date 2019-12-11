package component;

import java.util.ArrayList;
import java.util.List;

public class Swap {
	public static String[] swap (String[] array){
		List<String> list = new ArrayList<String>();
		for(int i=1;i<array.length;i++){
			list.add(array[i]);
		}
		list.add(array[0]);
		String[] result = new String[array.length];
		list.toArray(result);
		return result;
		
	}
	
	
}
