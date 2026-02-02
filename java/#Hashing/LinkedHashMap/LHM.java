import java.util.*;

public class LHM{
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        // insertion order maintained
        lhm.put("India",100);
        lhm.put("USA",10);
        lhm.put("China",1000);
        lhm.put("UK",200);
        System.out.println(lhm);

        // remove
        lhm.remove("USA");
        System.out.println(lhm);

        // get
        System.out.println(lhm.get("China"));
        System.out.println(lhm.get("Singapore"));

        // contains key
        System.out.println(lhm.containsKey("India"));
        System.out.println(lhm.containsKey("Singapore"));

        // size
        System.out.println(lhm.size());

        // is empty
        System.out.println(lhm.isEmpty());
        // clear
        // lhm.clear();
        System.out.println(lhm.isEmpty());

        Set<String> keys = lhm.keySet();
        System.out.println("Keys: "+keys);

        for(String k : keys){
            System.out.println("Key: "+k+" Value: "+lhm.get(k));
        }
    }
}