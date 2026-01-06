import java.util.*;

public class pairsum2{

   
    // => 2pointer approch O(n)
    public static boolean posiblepairsum2(ArrayList<Integer> list,int t){
        int pivot = -1;
        int n = list.size();
        for(int i=0; i<n;i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1;
        int rp = pivot;
        

        while(lp!=rp){
            if(list.get(lp)+list.get(rp) == t){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<t){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 16;

        System.out.println(posiblepairsum2(list,target));
    }
}