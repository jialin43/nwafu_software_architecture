package component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Output {
public static void output(List<String> data,String url) {
	FileWriter fw = null;
	
	try {
		fw = new FileWriter(url);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<data.size();i++){
			String dsd = data.get(i).toString();
			System.out.println(dsd);
			bw.write(data.get(i));
			bw.newLine();
		}
		bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
