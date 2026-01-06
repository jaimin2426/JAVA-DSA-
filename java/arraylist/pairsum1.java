import java.util.*;

public class pairsum1{

    // public static boolean posiblepair(ArrayList<Integer> pair,int target){
    //     for(int i=0;i<pair.size();i++){
    //         for(int j=i+1;j<pair.size();j++){
    //             if(target == pair.get(i)+pair.get(j)){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // => 2pointer approch
    public static boolean posiblepair(ArrayList<Integer> list,int t){
        int lp = 0;
        int rp = list.size()-1;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp) == t){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<t){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }


    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;

        System.out.println(posiblepair(list,target));
    }
}