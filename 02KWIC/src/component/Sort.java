package component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static List<String> sort(List<String> list){
        Collections.sort(list,(String s1,String s2)->s1.compareTo(s2));
        return list;
    }


}
