package component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swap {
    public static List<String> swap(List<String> input) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < input.size(); i++) {
            String line = input.get(i);

            String[] temp = line.split(" ");
            List<String> list = new ArrayList<>();
            list = Arrays.asList(temp);
            List arrList = new ArrayList(list);
            for (int j = 0; j < arrList.size(); j++) {
                String lastWord = arrList.remove(arrList.size() - 1).toString();
                arrList.add(0, lastWord);
                String out = String.join(" ", arrList);
                result.add(out);
            }
        }
        return result;
    }


}
