import java.util.HashMap;
import java.util.LinkedHashMap;
public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("India", 100);
        lm.put("China", 150);
        lm.put("US", 50);

        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(lm);
        System.out.println(hm);
    }
}