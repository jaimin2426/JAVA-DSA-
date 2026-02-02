import java.util.*;

public class Itineraryfromtickes{

    public static String getstart(HashMap<String,String> map){
        HashMap<String,String> revmap = new HashMap<>();
        for(String key:map.keySet()){
            revmap.put(map.get(key),key);
        }

        for(String key:map.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Banglore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        //find starting point
        String start = getstart(map);
        System.out.print(start);
        for(String key:map.keySet()){
            System.out.print(" -> "+ map.get(start));
            start = map.get(start);
        }
    }
}