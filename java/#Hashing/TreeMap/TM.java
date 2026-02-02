import java.util.*;

public class TM{
    public static void main(String args[]){
        // insertion sorted order maintained
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("USA",10);
        tm.put("China",1000);
        tm.put("UK",200);
        tm.put("Germany",150);
        System.out.println(tm);

        // remove
        tm.remove("USA");
        System.out.println(tm);

        // get
        System.out.println(tm.get("China"));
        System.out.println(tm.get("Singapore"));

        // contains key
        System.out.println(tm.containsKey("India"));
        System.out.println(tm.containsKey("Singapore"));

        // size
        System.out.println(tm.size());

        // is empty
        System.out.println(tm.isEmpty());
        // clear
        // tm.clear();
        System.out.println(tm.isEmpty());

        Set<String> keys = tm.keySet();
        System.out.println("Keys: "+keys);

        for(String k : keys){
            System.out.println("Key: "+k+" Value: "+tm.get(k));
        }
    }   
}