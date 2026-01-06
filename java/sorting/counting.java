import java.util.*;

public class counting{

    public static void printarr(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void count(int a[]){
        int n = a.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest, a[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[a[i]]++;
        }

        // sorting 
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j] = i;
                j++;
                count[i]--;
            }
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        count(a);
        printarr(a);
    
        
    }
}