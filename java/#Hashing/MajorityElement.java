import java.util.*;
// Given an array of size n, find the majority element. 
// The majority element is the element that appears more than ⌊ n/3 ⌋ times. 
public class MajorityElement{
    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};

        int n = arr.length/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i],map.get(arr[i])+1);
            // }
            // else{
            //     map.put(arr[i],1);
            // }

            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        // Set<Integer> keys = map.keySet();
        for(Integer k : map.keySet()){
            if(map.get(k) > n){
                System.out.println(k);
            }
        }
    }
}