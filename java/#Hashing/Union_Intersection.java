import java.util.*;

public class Union_Intersection{

    public static void union(int arr1[],int arr2[], HashSet<Integer> set){

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union size: "+set.size());
        System.out.println("Union elements: "+set);
    }

    public static void Intersection(int arr1[],int arr2[], HashSet<Integer> set){

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        System.out.print("Intersection elements: ");

        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println("\nIntersection size: "+count);
    }
    public static void main(String args[]){
        int arr1[] = {7,3,9,};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
        union(arr1,arr2,set);
        set.clear();
        Intersection(arr1,arr2,set);
    }
}