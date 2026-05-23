import java.util.*;
public class IterationOnJavacode{
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Nodia");
        hs.add("Bengaluru");
        System.out.println(hs);
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Delhi"); 
        lhs.add("Mumbai");
        lhs.add("Nodia");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Delhi"); 
        ts.add("Mumbai");
        ts.add("Nodia");
        ts.add("Bengaluru");
        System.out.println(ts);
    }
}