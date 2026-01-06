import java.util.*;

public class twoDAL{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        mlist.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        mlist.add(list2);

        for(int i=0;i<mlist.size();i++){
            ArrayList<Integer> clist = mlist.get(i);
            for(int j=0;j<clist.size();j++){
                System.out.print(clist.get(j)+" ");
            }
            System.out.println();
        }


    }
}