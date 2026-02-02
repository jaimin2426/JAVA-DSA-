import java.util.*;

public class operation{
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        // insertion O(1) 
        hm.put("India",100);
        hm.put("china",150);
        hm.put("US",200);

        System.out.println(hm);
        // get O(1) = search

        int population = hm.get("India");
        System.out.println("Population of India: "+population);

        System.out.println(hm.get("UK"));

        // contains key O(1)
        // true if key is present else false
        System.out.println(hm.containsKey("UK"));
        System.out.println(hm.containsKey("china"));

        // remove O(1)
        hm.remove("US");
        System.out.println(hm);

        // size O(1)
        System.out.println("Size of hashmap: "+hm.size());
        
        // isEmpty O(1)
        System.out.println("Is hashmap empty? "+hm.isEmpty()); 

        // clear O(1)
        hm.clear();
        System.out.println("After clear: "+hm);


        // iteration O(n)
        hm.put("India",100);
        hm.put("china",150);
        hm.put("US",200);

        Set<String> keys = hm.keySet();
        System.out.println("Keys: "+keys);

        for (String k: keys){
            System.out.println("Key: "+k+" Value: "+hm.get(k));
        }

    }
}