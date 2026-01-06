import java.util.*;
public class swap{

    public static void swap2(ArrayList<Integer> list,int i, int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int i = 1,j = 2;
        swap2(list,i,j);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}