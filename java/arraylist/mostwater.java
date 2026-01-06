import java.util.*;

public class mostwater{

    // // O(n^2)
    // public static int maxwater(ArrayList<Integer> height){
    //     int maxwater = 0; 
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int we = j-i;
    //             int currentwater = ht*we;
    //             maxwater = Math.max(maxwater,currentwater);
    //         } 
    //     }
    //     return maxwater;
    // }

    // => 2 pointer approach  O(n)
    public static int maxwater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp =0;
        int rp = height.size()-1;

        while(lp<rp){
            // clculate water area 

            int ht = Math.min(height.get(lp),height.get(rp));
            int we = rp - lp;
            int cwater = ht*we;
            maxwater = Math.max(maxwater,cwater);

            // update pointer

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int water = maxwater(list);
        System.out.println("max water "+water);


    }
}