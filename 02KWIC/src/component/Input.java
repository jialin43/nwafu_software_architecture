package component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Input {
    public static List<String> input(String url) {
        FileReader fr = null;
        BufferedReader br = null;
        List<String> lists = null;
        try {
            fr = new FileReader(url);
            br = new BufferedReader(fr);
            lists = new ArrayList<String>();
            try {
                while (br.ready()) {
                    lists.add(br.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lists;
    }

}
